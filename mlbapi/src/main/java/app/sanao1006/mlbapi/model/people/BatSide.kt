package app.sanao1006.mlbapi.model.people


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BatSide(
    @SerialName("code")
    val code: String,
    @SerialName("description")
    val description: String
)