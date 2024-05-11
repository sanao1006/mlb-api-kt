package app.sanao1006.mlbapi.model.schedule


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ScheduleResponse(
    @SerialName("copyright")
    val copyright: String,
    @SerialName("dates")
    val dates: List<Date>,
    @SerialName("totalEvents")
    val totalEvents: Int,
    @SerialName("totalGames")
    val totalGames: Int,
    @SerialName("totalGamesInProgress")
    val totalGamesInProgress: Int,
    @SerialName("totalItems")
    val totalItems: Int
)

data class Schedule(
    val dates: List<Date>,
    val totalEvents: Int,
    val totalGames: Int,
    val totalGamesInProgress: Int,
    val totalItems: Int
)
