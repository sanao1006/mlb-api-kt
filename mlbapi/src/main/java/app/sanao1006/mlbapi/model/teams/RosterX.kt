package app.sanao1006.mlbapi.model.teams


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RosterX(
    @SerialName("jerseyNumber")
    val jerseyNumber: String,
    @SerialName("parentTeamId")
    val parentTeamId: Int,
    @SerialName("person")
    val person: Person,
    @SerialName("position")
    val position: Position,
    @SerialName("status")
    val status: Status
)