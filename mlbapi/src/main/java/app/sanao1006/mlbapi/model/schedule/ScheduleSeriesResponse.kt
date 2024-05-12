package app.sanao1006.mlbapi.model.schedule


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ScheduleSeriesResponse(
    @SerialName("copyright")
    val copyright: String,
    @SerialName("series")
    val series: List<Series>,
    @SerialName("totalEvents")
    val totalEvents: Int,
    @SerialName("totalGames")
    val totalGames: Int,
    @SerialName("totalGamesInProgress")
    val totalGamesInProgress: Int,
    @SerialName("totalItems")
    val totalItems: Int,
    @SerialName("wait")
    val wait: Int
)

data class ScheduleSeries(
    val series: List<Series>,
    val totalEvents: Int,
    val totalGames: Int,
    val totalGamesInProgress: Int,
    val totalItems: Int,
    val wait: Int
)
