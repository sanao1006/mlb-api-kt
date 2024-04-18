package app.sanao1006.mlbapi.model.people


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class StatX(
    @SerialName("airOuts")
    val airOuts: Int? = null,
    @SerialName("assists")
    val assists: Int? = null,
    @SerialName("atBats")
    val atBats: Int? = null,
    @SerialName("atBatsPerHomeRun")
    val atBatsPerHomeRun: String? = null,
    @SerialName("avg")
    val avg: String? = null,
    @SerialName("babip")
    val babip: String? = null,
    @SerialName("balks")
    val balks: Int? = null,
    @SerialName("balls")
    val balls: Int? = null,
    @SerialName("baseOnBalls")
    val baseOnBalls: Int? = null,
    @SerialName("battersFaced")
    val battersFaced: Int? = null,
    @SerialName("catchersInterference")
    val catchersInterference: Int? = null,
    @SerialName("caughtStealing")
    val caughtStealing: Int? = null,
    @SerialName("chances")
    val chances: Int? = null,
    @SerialName("doubles")
    val doubles: Int? = null,
    @SerialName("errors")
    val errors: Int? = null,
    @SerialName("fielding")
    val fielding: String? = null,
    @SerialName("flyOuts")
    val flyOuts: Int? = null,
    @SerialName("gamesPitched")
    val gamesPitched: Int? = null,
    @SerialName("gamesPlayed")
    val gamesPlayed: Int? = null,
    @SerialName("groundIntoDoublePlay")
    val groundIntoDoublePlay: Int? = null,
    @SerialName("groundIntoTriplePlay")
    val groundIntoTriplePlay: Int? = null,
    @SerialName("groundOuts")
    val groundOuts: Int? = null,
    @SerialName("groundOutsToAirouts")
    val groundOutsToAirouts: String? = null,
    @SerialName("hitBatsmen")
    val hitBatsmen: Int? = null,
    @SerialName("hitByPitch")
    val hitByPitch: Int? = null,
    @SerialName("hits")
    val hits: Int? = null,
    @SerialName("hitsPer9Inn")
    val hitsPer9Inn: String? = null,
    @SerialName("homeRuns")
    val homeRuns: Int? = null,
    @SerialName("homeRunsPer9")
    val homeRunsPer9: String? = null,
    @SerialName("inningsPitched")
    val inningsPitched: String? = null,
    @SerialName("intentionalWalks")
    val intentionalWalks: Int? = null,
    @SerialName("leftOnBase")
    val leftOnBase: Int? = null,
    @SerialName("numberOfPitches")
    val numberOfPitches: Int? = null,
    @SerialName("obp")
    val obp: String? = null,
    @SerialName("ops")
    val ops: String? = null,
    @SerialName("outs")
    val outs: Int? = null,
    @SerialName("outsPitched")
    val outsPitched: Int? = null,
    @SerialName("passedBall")
    val passedBall: Int? = null,
    @SerialName("pickoffs")
    val pickoffs: Int? = null,
    @SerialName("pitchesPerInning")
    val pitchesPerInning: String? = null,
    @SerialName("plateAppearances")
    val plateAppearances: Int? = null,
    @SerialName("play")
    val play: Play? = null,
    @SerialName("putOuts")
    val putOuts: Int? = null,
    @SerialName("rbi")
    val rbi: Int? = null,
    @SerialName("runs")
    val runs: Int? = null,
    @SerialName("sacBunts")
    val sacBunts: Int? = null,
    @SerialName("sacFlies")
    val sacFlies: Int? = null,
    @SerialName("slg")
    val slg: String? = null,
    @SerialName("stolenBasePercentage")
    val stolenBasePercentage: String? = null,
    @SerialName("stolenBases")
    val stolenBases: Int? = null,
    @SerialName("strikeOuts")
    val strikeOuts: Int? = null,
    @SerialName("strikePercentage")
    val strikePercentage: String? = null,
    @SerialName("strikeoutWalkRatio")
    val strikeoutWalkRatio: String? = null,
    @SerialName("strikeoutsPer9Inn")
    val strikeoutsPer9Inn: String? = null,
    @SerialName("strikes")
    val strikes: Int? = null,
    @SerialName("summary")
    val summary: String? = null,
    @SerialName("totalBases")
    val totalBases: Int? = null,
    @SerialName("triples")
    val triples: Int? = null,
    @SerialName("walksPer9Inn")
    val walksPer9Inn: String? = null,
    @SerialName("whip")
    val whip: String? = null,
    @SerialName("wildPitches")
    val wildPitches: Int? = null
)