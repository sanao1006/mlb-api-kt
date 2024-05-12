package app.sanao1006.mlbapi.model.schedule


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Series(
    @SerialName("games")
    val games: List<Game>,
    @SerialName("series")
    val seriesItem: SeriesItem,
    @SerialName("sortOrder")
    val sortOrder: Int,
    @SerialName("totalGames")
    val totalGames: Int,
    @SerialName("totalGamesInProgress")
    val totalGamesInProgress: Int,
    @SerialName("totalItems")
    val totalItems: Int
)
