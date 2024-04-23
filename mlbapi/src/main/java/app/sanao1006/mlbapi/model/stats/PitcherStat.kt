package app.sanao1006.mlbapi.model.stats


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PitcherStat(
    @SerialName("airOuts")
    val airOuts: Int,
    @SerialName("atBats")
    val atBats: Int,
    @SerialName("avg")
    val avg: String,
    @SerialName("balks")
    val balks: Int,
    @SerialName("baseOnBalls")
    val baseOnBalls: Int,
    @SerialName("battersFaced")
    val battersFaced: Int,
    @SerialName("blownSaves")
    val blownSaves: Int,
    @SerialName("catchersInterference")
    val catchersInterference: Int,
    @SerialName("caughtStealing")
    val caughtStealing: Int,
    @SerialName("completeGames")
    val completeGames: Int,
    @SerialName("doubles")
    val doubles: Int,
    @SerialName("earnedRuns")
    val earnedRuns: Int,
    @SerialName("era")
    val era: String,
    @SerialName("gamesFinished")
    val gamesFinished: Int,
    @SerialName("gamesPitched")
    val gamesPitched: Int,
    @SerialName("gamesPlayed")
    val gamesPlayed: Int,
    @SerialName("gamesStarted")
    val gamesStarted: Int,
    @SerialName("groundIntoDoublePlay")
    val groundIntoDoublePlay: Int,
    @SerialName("groundOuts")
    val groundOuts: Int,
    @SerialName("groundOutsToAirouts")
    val groundOutsToAirouts: String,
    @SerialName("hitBatsmen")
    val hitBatsmen: Int,
    @SerialName("hitByPitch")
    val hitByPitch: Int,
    @SerialName("hits")
    val hits: Int,
    @SerialName("hitsPer9Inn")
    val hitsPer9Inn: String,
    @SerialName("holds")
    val holds: Int,
    @SerialName("homeRuns")
    val homeRuns: Int,
    @SerialName("homeRunsPer9")
    val homeRunsPer9: String,
    @SerialName("inheritedRunners")
    val inheritedRunners: Int,
    @SerialName("inheritedRunnersScored")
    val inheritedRunnersScored: Int,
    @SerialName("inningsPitched")
    val inningsPitched: String,
    @SerialName("intentionalWalks")
    val intentionalWalks: Int,
    @SerialName("losses")
    val losses: Int,
    @SerialName("numberOfPitches")
    val numberOfPitches: Int,
    @SerialName("obp")
    val obp: String,
    @SerialName("ops")
    val ops: String,
    @SerialName("outs")
    val outs: Int,
    @SerialName("pickoffs")
    val pickoffs: Int,
    @SerialName("pitchesPerInning")
    val pitchesPerInning: String,
    @SerialName("runs")
    val runs: Int,
    @SerialName("runsScoredPer9")
    val runsScoredPer9: String,
    @SerialName("sacBunts")
    val sacBunts: Int,
    @SerialName("sacFlies")
    val sacFlies: Int,
    @SerialName("saveOpportunities")
    val saveOpportunities: Int,
    @SerialName("saves")
    val saves: Int,
    @SerialName("shutouts")
    val shutouts: Int,
    @SerialName("slg")
    val slg: String,
    @SerialName("stolenBasePercentage")
    val stolenBasePercentage: String,
    @SerialName("stolenBases")
    val stolenBases: Int,
    @SerialName("strikeOuts")
    val strikeOuts: Int,
    @SerialName("strikePercentage")
    val strikePercentage: String,
    @SerialName("strikeoutWalkRatio")
    val strikeoutWalkRatio: String,
    @SerialName("strikeoutsPer9Inn")
    val strikeoutsPer9Inn: String,
    @SerialName("strikes")
    val strikes: Int,
    @SerialName("totalBases")
    val totalBases: Int,
    @SerialName("triples")
    val triples: Int,
    @SerialName("walksPer9Inn")
    val walksPer9Inn: String,
    @SerialName("whip")
    val whip: String,
    @SerialName("wildPitches")
    val wildPitches: Int,
    @SerialName("winPercentage")
    val winPercentage: String,
    @SerialName("wins")
    val wins: Int
)