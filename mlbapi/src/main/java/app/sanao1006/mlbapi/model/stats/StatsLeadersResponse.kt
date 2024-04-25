package app.sanao1006.mlbapi.model.stats


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class StatsLeadersResponse(
    @SerialName("copyright")
    val copyright: String,
    @SerialName("leagueLeaders")
    val leagueLeaders: List<LeagueLeader>
)