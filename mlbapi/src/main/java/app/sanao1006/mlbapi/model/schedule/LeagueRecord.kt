package app.sanao1006.mlbapi.model.schedule


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LeagueRecord(
    @SerialName("losses")
    val losses: Int,
    @SerialName("pct")
    val pct: String,
    @SerialName("wins")
    val wins: Int
)