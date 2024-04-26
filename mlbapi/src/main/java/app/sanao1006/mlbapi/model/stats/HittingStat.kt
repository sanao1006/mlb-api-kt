package app.sanao1006.mlbapi.model.stats


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("Hitting")
data class HittingStat(
    @SerialName("atBatsPerHomeRun")
    val atBatsPerHomeRun: String,
    @SerialName("babip")
    val babip: String,
    @SerialName("leftOnBase")
    val leftOnBase: Int,
    @SerialName("plateAppearances")
    val plateAppearances: Int,
    @SerialName("rbi")
    val rbi: Int,
    override val airOuts: Int,
    override val atBats: Int,
    override val doubles: Int,
    override val avg: String,
    override val caughtStealing: Int,
    override val catchersInterference: Int,
    override val baseOnBalls: Int,
    override val groundIntoDoublePlay: Int,
    override val groundOuts: Int,
    override val groundOutsToAirouts: String,
    override val gamesPlayed: Int,
    override val hits: Int,
    override val homeRuns: Int,
    override val hitByPitch: Int,
    override val intentionalWalks: Int,
    override val obp: String,
    override val ops: String,
    override val sacBunts: Int,
    override val sacFlies: Int,
    override val runs: Int,
    override val slg: String,
    override val stolenBasePercentage: String,
    override val stolenBases: Int,
    override val triples: Int,
    override val totalBases: Int,
    override val strikeOuts: Int,
    override val numberOfPitches: Int,
): HittingOrPitchingStat()