package app.sanao1006.mlbapi.model.schedule


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class StatusTied(
    @SerialName("abstractGameCode")
    val abstractGameCode: String,
    @SerialName("abstractGameState")
    val abstractGameState: String,
    @SerialName("codedGameState")
    val codedGameState: String,
    @SerialName("detailedState")
    val detailedState: String,
    @SerialName("reason")
    val reason: String,
    @SerialName("startTimeTBD")
    val startTimeTBD: Boolean,
    @SerialName("statusCode")
    val statusCode: String
)