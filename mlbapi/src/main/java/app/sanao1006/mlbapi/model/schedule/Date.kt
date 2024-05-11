package app.sanao1006.mlbapi.model.schedule


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Date(
    @SerialName("date")
    val date: String,
    @SerialName("events")
    val events: List<String>,
    @SerialName("games")
    val games: List<Game>,
    @SerialName("totalEvents")
    val totalEvents: Int,
    @SerialName("totalGames")
    val totalGames: Int,
    @SerialName("totalGamesInProgress")
    val totalGamesInProgress: Int,
    @SerialName("totalItems")
    val totalItems: Int
)