package app.sanao1006.mlbapi.model.teams


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TeamStatsResponse(
    @SerialName("stats")
    val stats: List<Stat>
)