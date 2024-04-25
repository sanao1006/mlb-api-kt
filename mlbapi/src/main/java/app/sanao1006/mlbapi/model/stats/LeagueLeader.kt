package app.sanao1006.mlbapi.model.stats


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LeagueLeader(
    @SerialName("gameType")
    val gameType: GameType,
    @SerialName("leaderCategory")
    val leaderCategory: String,
    @SerialName("leaders")
    val leaders: List<Leader>,
    @SerialName("statGroup")
    val statGroup: String,
    @SerialName("totalSplits")
    val totalSplits: Int
)