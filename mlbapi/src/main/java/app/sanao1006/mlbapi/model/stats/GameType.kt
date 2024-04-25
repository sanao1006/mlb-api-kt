package app.sanao1006.mlbapi.model.stats


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GameType(
    @SerialName("description")
    val description: String,
    @SerialName("id")
    val id: String
)