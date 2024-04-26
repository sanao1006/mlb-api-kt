package app.sanao1006.mlbapi.model.stats


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PitchingStat(
    @SerialName("balks")
    val balks: Int,
    @SerialName("battersFaced")
    val battersFaced: Int,
    @SerialName("blownSaves")
    val blownSaves: Int,
    @SerialName("completeGames")
    val completeGames: Int,
    @SerialName("earnedRuns")
    val earnedRuns: Int,
    @SerialName("era")
    val era: String,
    @SerialName("gamesFinished")
    val gamesFinished: Int,
    @SerialName("gamesPitched")
    val gamesPitched: Int,
    @SerialName("gamesStarted")
    val gamesStarted: Int,
    @SerialName("hitBatsmen")
    val hitBatsmen: Int,
    @SerialName("hitsPer9Inn")
    val hitsPer9Inn: String,
    @SerialName("holds")
    val holds: Int,
    @SerialName("homeRunsPer9")
    val homeRunsPer9: String,
    @SerialName("inheritedRunners")
    val inheritedRunners: Int,
    @SerialName("inheritedRunnersScored")
    val inheritedRunnersScored: Int,
    @SerialName("inningsPitched")
    val inningsPitched: String,
    @SerialName("losses")
    val losses: Int,
    @SerialName("outs")
    val outs: Int,
    @SerialName("pickoffs")
    val pickoffs: Int,
    @SerialName("pitchesPerInning")
    val pitchesPerInning: String,
    @SerialName("runsScoredPer9")
    val runsScoredPer9: String,
    @SerialName("saveOpportunities")
    val saveOpportunities: Int,
    @SerialName("saves")
    val saves: Int,
    @SerialName("shutouts")
    val shutouts: Int,
    @SerialName("strikePercentage")
    val strikePercentage: String,
    @SerialName("strikeoutWalkRatio")
    val strikeoutWalkRatio: String,
    @SerialName("strikeoutsPer9Inn")
    val strikeoutsPer9Inn: String,
    @SerialName("strikes")
    val strikes: Int,
    @SerialName("walksPer9Inn")
    val walksPer9Inn: String,
    @SerialName("whip")
    val whip: String,
    @SerialName("wildPitches")
    val wildPitches: Int,
    @SerialName("winPercentage")
    val winPercentage: String,
    @SerialName("wins")
    val wins: Int,
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