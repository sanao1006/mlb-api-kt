package app.sanao1006.mlbapi.model.attendance


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AttendanceHighGame(
    @SerialName("content")
    val content: Content,
    @SerialName("dayNight")
    val dayNight: String,
    @SerialName("gamePk")
    val gamePk: Int,
    @SerialName("link")
    val link: String
)
