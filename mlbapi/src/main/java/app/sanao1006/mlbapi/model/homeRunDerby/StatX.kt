package app.sanao1006.mlbapi.model.homeRunDerby


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class StatX(
    @SerialName("airOuts")
    val airOuts: Int? = null,
    @SerialName("atBats")
    val atBats: Int? = null,
    @SerialName("atBatsPerHomeRun")
    val atBatsPerHomeRun: String? = null,
    @SerialName("avg")
    val avg: String? = null,
    @SerialName("babip")
    val babip: String? = null,
    @SerialName("baseOnBalls")
    val baseOnBalls: Int? = null,
    @SerialName("catchersInterference")
    val catchersInterference: Int? = null,
    @SerialName("caughtStealing")
    val caughtStealing: Int? = null,
    @SerialName("doubles")
    val doubles: Int? = null,
    @SerialName("gamesPlayed")
    val gamesPlayed: Int? = null,
    @SerialName("groundIntoDoublePlay")
    val groundIntoDoublePlay: Int? = null,
    @SerialName("groundOuts")
    val groundOuts: Int? = null,
    @SerialName("groundOutsToAirouts")
    val groundOutsToAirouts: String? = null,
    @SerialName("hitByPitch")
    val hitByPitch: Int? = null,
    @SerialName("hits")
    val hits: Int? = null,
    @SerialName("homeRuns")
    val homeRuns: Int? = null,
    @SerialName("intentionalWalks")
    val intentionalWalks: Int? = null,
    @SerialName("leftOnBase")
    val leftOnBase: Int? = null,
    @SerialName("metric")
    val metric: Metric? = null,
    @SerialName("numberOfPitches")
    val numberOfPitches: Int? = null,
    @SerialName("obp")
    val obp: String? = null,
    @SerialName("ops")
    val ops: String? = null,
    @SerialName("plateAppearances")
    val plateAppearances: Int? = null,
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
    @SerialName("totalBases")
    val totalBases: Int? = null,
    @SerialName("triples")
    val triples: Int? = null
)