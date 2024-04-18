package app.sanao1006.mlbapi.model.people


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Details(
    @SerialName("awayScore")
    val awayScore: Int,
    @SerialName("ballColor")
    val ballColor: String,
    @SerialName("call")
    val call: Call,
    @SerialName("code")
    val code: String,
    @SerialName("description")
    val description: String,
    @SerialName("hasReview")
    val hasReview: Boolean,
    @SerialName("homeScore")
    val homeScore: Int,
    @SerialName("isBall")
    val isBall: Boolean,
    @SerialName("isInPlay")
    val isInPlay: Boolean,
    @SerialName("isOut")
    val isOut: Boolean,
    @SerialName("isStrike")
    val isStrike: Boolean,
    @SerialName("trailColor")
    val trailColor: String,
    @SerialName("type")
    val type: Type
)