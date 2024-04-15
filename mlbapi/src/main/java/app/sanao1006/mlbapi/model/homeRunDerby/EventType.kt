package app.sanao1006.mlbapi.model.homeRunDerby


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class EventType(
    @SerialName("code")
    val code: String,
    @SerialName("name")
    val name: String
)