package app.sanao1006.mlbapi.model.homeRunDerby


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Hit(
    @SerialName("bonusTime")
    val bonusTime: Boolean,
    @SerialName("hitData")
    val hitData: HitData,
    @SerialName("homeRun")
    val homeRun: Boolean,
    @SerialName("isBonusTime")
    val isBonusTime: Boolean,
    @SerialName("isHomeRun")
    val isHomeRun: Boolean,
    @SerialName("isTieBreaker")
    val isTieBreaker: Boolean,
    @SerialName("playId")
    val playId: String? = null,
    @SerialName("tieBreaker")
    val tieBreaker: Boolean,
    @SerialName("timeRemaining")
    val timeRemaining: String
)