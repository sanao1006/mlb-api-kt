package app.sanao1006.mlbapi.model.homeRunDerby


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Status(
    @SerialName("bonusTime")
    val bonusTime: Boolean,
    @SerialName("clockStopped")
    val clockStopped: Boolean,
    @SerialName("currentRound")
    val currentRound: Int,
    @SerialName("currentRoundTimeLeft")
    val currentRoundTimeLeft: String,
    @SerialName("inTieBreaker")
    val inTieBreaker: Boolean,
    @SerialName("state")
    val state: String,
    @SerialName("tieBreakerNum")
    val tieBreakerNum: Int
)