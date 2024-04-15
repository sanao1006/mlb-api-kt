package app.sanao1006.mlbapi.model.highlow


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Game(
    @SerialName("content")
    val content: Content,
    @SerialName("dayNight")
    val dayNight: String,
    @SerialName("gameNumber")
    val gameNumber: Int,
    @SerialName("gamePk")
    val gamePk: Int,
    @SerialName("link")
    val link: String
)
