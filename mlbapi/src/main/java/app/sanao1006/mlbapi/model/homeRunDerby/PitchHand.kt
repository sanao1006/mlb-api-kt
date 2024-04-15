package app.sanao1006.mlbapi.model.homeRunDerby


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PitchHand(
    @SerialName("code")
    val code: String,
    @SerialName("description")
    val description: String
)