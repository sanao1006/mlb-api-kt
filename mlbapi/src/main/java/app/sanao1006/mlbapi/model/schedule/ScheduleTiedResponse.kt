package app.sanao1006.mlbapi.model.schedule


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ScheduleTiedResponse(
    @SerialName("copyright")
    val copyright: String,
    @SerialName("dates")
    val dates: List<DateTied>,
    @SerialName("totalEvents")
    val totalEvents: Int,
    @SerialName("totalGames")
    val totalGames: Int,
    @SerialName("totalGamesInProgress")
    val totalGamesInProgress: Int,
    @SerialName("totalItems")
    val totalItems: Int
)