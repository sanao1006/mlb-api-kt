package app.sanao1006.mlbapi.model.stats


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class StatXX(
    @SerialName("airOuts")
    val airOuts: Int,
    @SerialName("atBats")
    val atBats: Int,
    @SerialName("atBatsPerHomeRun")
    val atBatsPerHomeRun: String,
    @SerialName("avg")
    val avg: String,
    @SerialName("babip")
    val babip: String,
    @SerialName("baseOnBalls")
    val baseOnBalls: Int,
    @SerialName("catchersInterference")
    val catchersInterference: Int,
    @SerialName("caughtStealing")
    val caughtStealing: Int,
    @SerialName("doubles")
    val doubles: Int,
    @SerialName("gamesPlayed")
    val gamesPlayed: Int,
    @SerialName("groundIntoDoublePlay")
    val groundIntoDoublePlay: Int,
    @SerialName("groundOuts")
    val groundOuts: Int,
    @SerialName("groundOutsToAirouts")
    val groundOutsToAirouts: String,
    @SerialName("hitByPitch")
    val hitByPitch: Int,
    @SerialName("hits")
    val hits: Int,
    @SerialName("homeRuns")
    val homeRuns: Int,
    @SerialName("intentionalWalks")
    val intentionalWalks: Int,
    @SerialName("leftOnBase")
    val leftOnBase: Int,
    @SerialName("numberOfPitches")
    val numberOfPitches: Int,
    @SerialName("obp")
    val obp: String,
    @SerialName("ops")
    val ops: String,
    @SerialName("plateAppearances")
    val plateAppearances: Int,
    @SerialName("rbi")
    val rbi: Int,
    @SerialName("runs")
    val runs: Int,
    @SerialName("sacBunts")
    val sacBunts: Int,
    @SerialName("sacFlies")
    val sacFlies: Int,
    @SerialName("slg")
    val slg: String,
    @SerialName("stolenBasePercentage")
    val stolenBasePercentage: String,
    @SerialName("stolenBases")
    val stolenBases: Int,
    @SerialName("strikeOuts")
    val strikeOuts: Int,
    @SerialName("totalBases")
    val totalBases: Int,
    @SerialName("triples")
    val triples: Int
)