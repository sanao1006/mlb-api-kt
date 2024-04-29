package app.sanao1006.mlbapi.model.teams


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TeamLeader(
    @SerialName("gameType")
    val gameType: GameType,
    @SerialName("leaderCategory")
    val leaderCategory: String,
    @SerialName("leaders")
    val leaders: List<Leader>,
    @SerialName("season")
    val season: String,
    @SerialName("statGroup")
    val statGroup: String,
    @SerialName("team")
    val team: BelongingTeam,
    @SerialName("totalSplits")
    val totalSplits: Int
)