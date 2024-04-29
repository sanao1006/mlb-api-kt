package app.sanao1006.mlbapi.model.teams


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TeamResponse(
    @SerialName("copyright")
    val copyright: String,
    @SerialName("teams")
    val teams: List<Team>
)