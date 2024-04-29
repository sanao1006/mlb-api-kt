package app.sanao1006.mlbapi.model.teams


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TeamLeadersResponse(
    @SerialName("copyright")
    val copyright: String,
    @SerialName("teamLeaders")
    val teamLeaders: List<TeamLeader>
)