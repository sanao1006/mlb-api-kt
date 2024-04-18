package app.sanao1006.mlbapi.model.people


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class FreeAgent(
    @SerialName("dateDeclared")
    val dateDeclared: String? = null,
    @SerialName("dateSigned")
    val dateSigned: String? = null,
    @SerialName("newTeam")
    val newTeam: NewTeam,
    @SerialName("notes")
    val notes: String? = null,
    @SerialName("originalTeam")
    val originalTeam: OriginalTeam,
    @SerialName("player")
    val player: Player,
    @SerialName("position")
    val position: Position,
    @SerialName("sortOrder")
    val sortOrder: Int? = null
)