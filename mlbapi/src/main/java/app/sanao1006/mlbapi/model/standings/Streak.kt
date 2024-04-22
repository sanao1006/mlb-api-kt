package app.sanao1006.mlbapi.model.standings


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Streak(
    @SerialName("streakCode")
    val streakCode: String,
    @SerialName("streakNumber")
    val streakNumber: Int,
    @SerialName("streakType")
    val streakType: String
)