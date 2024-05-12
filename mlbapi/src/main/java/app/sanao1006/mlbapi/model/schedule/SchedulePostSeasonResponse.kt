package app.sanao1006.mlbapi.model.schedule


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SchedulePostSeasonResponse(
    @SerialName("copyright")
    val copyright: String,
    @SerialName("dates")
    val dates: List<DatePostSeason> = emptyList(),
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

data class SchedulePostSeason(
    val dates: List<DatePostSeason>,
    val totalEvents: Int,
    val totalGames: Int,
    val totalGamesInProgress: Int,
    val totalItems: Int
)
