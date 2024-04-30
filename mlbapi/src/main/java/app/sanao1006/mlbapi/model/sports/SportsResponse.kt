package app.sanao1006.mlbapi.model.sports


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SportsResponse(
    @SerialName("copyright")
    val copyright: String,
    @SerialName("sports")
    val sports: List<Sport>
)