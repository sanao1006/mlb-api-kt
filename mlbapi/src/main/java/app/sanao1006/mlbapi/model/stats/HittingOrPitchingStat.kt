package app.sanao1006.mlbapi.model.stats

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonClassDiscriminator
import kotlinx.serialization.json.JsonDecoder
import kotlinx.serialization.json.JsonEncoder
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.int
import kotlinx.serialization.json.jsonPrimitive
import kotlinx.serialization.serializer

@Serializable
@OptIn(ExperimentalSerializationApi::class)
@JsonClassDiscriminator("customType")
abstract class HittingOrPitchingStat {
    abstract val airOuts: Int
    abstract val atBats: Int
    abstract val doubles: Int
    abstract val avg: String
    abstract val caughtStealing: Int
    abstract val catchersInterference: Int
    abstract val baseOnBalls: Int
    abstract val groundIntoDoublePlay: Int
    abstract val groundOuts: Int
    abstract val groundOutsToAirouts: String
    abstract val gamesPlayed: Int
    abstract val hits: Int
    abstract val homeRuns: Int
    abstract val hitByPitch: Int
    abstract val intentionalWalks: Int
    abstract val obp: String
    abstract val ops: String
    abstract val sacBunts: Int
    abstract val sacFlies: Int
    abstract val runs: Int
    abstract val slg: String
    abstract val stolenBasePercentage: String
    abstract val stolenBases: Int
    abstract val triples: Int
    abstract val totalBases: Int
    abstract val strikeOuts: Int
    abstract val numberOfPitches: Int
}

@ExperimentalSerializationApi
object HittingOrPitchingStatSerializer: KSerializer<HittingOrPitchingStat>{
    override val descriptor: SerialDescriptor
        get() = buildClassSerialDescriptor(HittingOrPitchingStat::class.qualifiedName!!) {
            // TODO
        }
    override fun deserialize(decoder: Decoder): HittingOrPitchingStat {
        require(decoder is JsonDecoder)
        val element = decoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Expected JsonObject")
        return if(element["rbi"] != null) HittingStat(
            atBatsPerHomeRun = element["atBatsPerHomeRun"]?.toString() ?: "",
            babip = element["babip"]?.toString() ?: "",
            leftOnBase = element["leftOnBase"]?.jsonPrimitive?.int ?: 0,
            plateAppearances = element["plateAppearances"]?.jsonPrimitive?.int ?: 0,
            rbi = element["rbi"]?.jsonPrimitive?.int ?: 0,
            airOuts = element["airOuts"]?.jsonPrimitive?.int ?: 0,
            atBats = element["atBats"]?.jsonPrimitive?.int ?: 0,
            doubles = element["doubles"]?.jsonPrimitive?.int ?: 0,
            avg = element["avg"]?.toString() ?: "",
            caughtStealing = element["caughtStealing"]?.jsonPrimitive?.int ?: 0,
            catchersInterference = element["catchersInterference"]?.jsonPrimitive?.int ?: 0,
            baseOnBalls = element["baseOnBalls"]?.jsonPrimitive?.int ?: 0,
            groundIntoDoublePlay = element["groundIntoDoublePlay"]?.jsonPrimitive?.int ?: 0,
            groundOuts = element["groundOuts"]?.jsonPrimitive?.int ?: 0,
            groundOutsToAirouts = element["groundOutsToAirouts"]?.toString() ?: "",
            gamesPlayed = element["gamesPlayed"]?.jsonPrimitive?.int ?: 0,
            hits = element["hits"]?.jsonPrimitive?.int ?: 0,
            homeRuns = element["homeRuns"]?.jsonPrimitive?.int ?: 0,
            hitByPitch = element["hitByPitch"]?.jsonPrimitive?.int ?: 0,
            intentionalWalks = element["intentionalWalks"]?.jsonPrimitive?.int ?: 0,
            obp = element["obp"]?.toString() ?: "",
            ops = element["ops"]?.toString() ?: "",
            sacBunts = element["sacBunts"]?.jsonPrimitive?.int ?: 0,
            sacFlies = element["sacFlies"]?.jsonPrimitive?.int ?: 0,
            runs = element["runs"]?.jsonPrimitive?.int ?: 0,
            slg = element["slg"]?.toString() ?: "",
            stolenBasePercentage = element["stolenBasePercentage"]?.toString() ?: "",
            stolenBases = element["stolenBases"]?.jsonPrimitive?.int ?: 0,
            triples = element["triples"]?.jsonPrimitive?.int ?: 0,
            totalBases = element["totalBases"]?.jsonPrimitive?.int ?: 0,
            strikeOuts = element["strikeOuts"]?.jsonPrimitive?.int ?: 0,
            numberOfPitches = element["numberOfPitches"]?.jsonPrimitive?.int ?: 0
        ) else {
            PitchingStat(
                balks = element["balks"]?.jsonPrimitive?.int ?: 0,
                battersFaced = element["battersFaced"]?.jsonPrimitive?.int ?: 0,
                blownSaves = element["blownSaves"]?.jsonPrimitive?.int ?: 0,
                completeGames = element["completeGames"]?.jsonPrimitive?.int ?: 0,
                earnedRuns = element["earnedRuns"]?.jsonPrimitive?.int ?: 0,
                era = element["era"]?.toString() ?: "" ,
                gamesFinished = element["gamesFinished"]?.jsonPrimitive?.int ?: 0,
                gamesPitched = element["gamesPitched"]?.jsonPrimitive?.int ?: 0,
                gamesStarted = element["gamesStarted"]?.jsonPrimitive?.int ?: 0,
                hitBatsmen = element["hitBatsmen"]?.jsonPrimitive?.int ?: 0,
                hitsPer9Inn = element["hitsPer9Inn"]?.toString() ?: "",
                holds = element["holds"]?.jsonPrimitive?.int ?: 0,
                homeRunsPer9 = element["homeRunsPer9"]?.toString() ?: "",
                inheritedRunners = element["inheritedRunners"]?.jsonPrimitive?.int ?: 0,
                inheritedRunnersScored =  element["inheritedRunnersScored"]?.jsonPrimitive?.int ?: 0,
                inningsPitched =  element["inningsPitched"]?.toString() ?: "",
                losses =  element["losses"]?.jsonPrimitive?.int ?: 0,
                outs = element["outs"]?.jsonPrimitive?.int ?: 0,
                pickoffs =  element["losses"]?.jsonPrimitive?.int ?: 0,
                pitchesPerInning =  element["pitchesPerInning"]?.toString() ?: "",
                runsScoredPer9 =  element["runsScoredPer9"]?.toString() ?: "",
                saveOpportunities =  element["saveOpportunities"]?.jsonPrimitive?.int ?: 0,
                saves =  element["saves"]?.jsonPrimitive?.int ?: 0,
                shutouts = element["shutouts"]?.jsonPrimitive?.int ?: 0,
                strikePercentage = element["strikePercentage"]?.toString() ?: "",
                strikeoutWalkRatio = element["strikeoutWalkRatio"]?.toString() ?: "",
                strikeoutsPer9Inn = element["strikeoutsPer9Inn"]?.toString() ?: "",
                strikes = element["strikes"]?.jsonPrimitive?.int ?: 0,
                walksPer9Inn = element["walksPer9Inn"]?.toString() ?: "",
                whip = element["whip"]?.toString() ?: "",
                wildPitches = element["wildPitches"]?.jsonPrimitive?.int ?: 0,
                winPercentage = element["winPercentage"]?.toString() ?: "",
                wins = element["wins"]?.jsonPrimitive?.int ?: 0,
                airOuts = element["airOuts"]?.jsonPrimitive?.int ?: 0,
                atBats = element["atBats"]?.jsonPrimitive?.int ?: 0,
                doubles = element["doubles"]?.jsonPrimitive?.int ?: 0,
                avg = element["avg"]?.toString() ?: "",
                caughtStealing = element["caughtStealing"]?.jsonPrimitive?.int ?: 0,
                catchersInterference = element["catchersInterference"]?.jsonPrimitive?.int ?: 0,
                baseOnBalls = element["baseOnBalls"]?.jsonPrimitive?.int ?: 0,
                groundIntoDoublePlay = element["groundIntoDoublePlay"]?.jsonPrimitive?.int ?: 0,
                groundOuts = element["groundOuts"]?.jsonPrimitive?.int ?: 0,
                groundOutsToAirouts = element["groundOutsToAirouts"]?.toString() ?: "",
                gamesPlayed = element["gamesPlayed"]?.jsonPrimitive?.int ?: 0,
                hits = element["hits"]?.jsonPrimitive?.int ?: 0,
                homeRuns = element["homeRuns"]?.jsonPrimitive?.int ?: 0,
                hitByPitch = element["hitByPitch"]?.jsonPrimitive?.int ?: 0,
                intentionalWalks = element["intentionalWalks"]?.jsonPrimitive?.int ?: 0,
                obp = element["obp"]?.toString() ?: "",
                ops = element["ops"]?.toString() ?: "",
                sacBunts = element["sacBunts"]?.jsonPrimitive?.int ?: 0,
                sacFlies = element["sacFlies"]?.jsonPrimitive?.int ?: 0,
                runs = element["runs"]?.jsonPrimitive?.int ?: 0,
                slg = element["slg"]?.toString() ?: "",
                stolenBasePercentage = element["stolenBasePercentage"]?.toString() ?: "",
                stolenBases = element["stolenBases"]?.jsonPrimitive?.int ?: 0,
                triples = element["triples"]?.jsonPrimitive?.int ?: 0,
                totalBases = element["totalBases"]?.jsonPrimitive?.int ?: 0,
                strikeOuts = element["strikeOuts"]?.jsonPrimitive?.int ?: 0,
                numberOfPitches = element["numberOfPitches"]?.jsonPrimitive?.int ?: 0
            )
        }

    }

    override fun serialize(encoder: Encoder, value: HittingOrPitchingStat) {
        require(encoder is JsonEncoder)
        encoder.encodeSerializableValue(serializer(), value)
    }
}
