package app.sanao1006.mlbapi.model.standings


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LeagueRecordX(
    @SerialName("league")
    val league: LeagueX,
    @SerialName("losses")
    val losses: Int,
    @SerialName("pct")
    val pct: String,
    @SerialName("wins")
    val wins: Int
)