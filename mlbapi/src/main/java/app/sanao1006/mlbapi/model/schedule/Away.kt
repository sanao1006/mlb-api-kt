package app.sanao1006.mlbapi.model.schedule


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Away(
    @SerialName("isWinner")
    val isWinner: Boolean? = null,
    @SerialName("leagueRecord")
    val leagueRecord: LeagueRecord,
    @SerialName("score")
    val score: Int,
    @SerialName("seriesNumber")
    val seriesNumber: Int,
    @SerialName("splitSquad")
    val splitSquad: Boolean,
    @SerialName("team")
    val team: Team
)