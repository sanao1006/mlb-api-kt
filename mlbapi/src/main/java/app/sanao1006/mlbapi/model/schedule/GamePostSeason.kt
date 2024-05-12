package app.sanao1006.mlbapi.model.schedule


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GamePostSeason(
    @SerialName("calendarEventID")
    val calendarEventID: String,
    @SerialName("content")
    val content: Content,
    @SerialName("dayNight")
    val dayNight: String,
    @SerialName("description")
    val description: String,
    @SerialName("doubleHeader")
    val doubleHeader: String,
    @SerialName("gameDate")
    val gameDate: String,
    @SerialName("gameGuid")
    val gameGuid: String,
    @SerialName("gameNumber")
    val gameNumber: Int,
    @SerialName("gamePk")
    val gamePk: Int,
    @SerialName("gameType")
    val gameType: String,
    @SerialName("gamedayType")
    val gamedayType: String,
    @SerialName("gamesInSeries")
    val gamesInSeries: Int,
    @SerialName("ifNecessary")
    val ifNecessary: String,
    @SerialName("ifNecessaryDescription")
    val ifNecessaryDescription: String,
    @SerialName("inningBreakLength")
    val inningBreakLength: Int,
    @SerialName("isFeaturedGame")
    val isFeaturedGame: Boolean,
    @SerialName("isTie")
    val isTie: Boolean,
    @SerialName("link")
    val link: String,
    @SerialName("officialDate")
    val officialDate: String,
    @SerialName("publicFacing")
    val publicFacing: Boolean,
    @SerialName("recordSource")
    val recordSource: String,
    @SerialName("reverseHomeAwayStatus")
    val reverseHomeAwayStatus: Boolean,
    @SerialName("scheduledInnings")
    val scheduledInnings: Int,
    @SerialName("season")
    val season: String,
    @SerialName("seasonDisplay")
    val seasonDisplay: String,
    @SerialName("seriesDescription")
    val seriesDescription: String,
    @SerialName("seriesGameNumber")
    val seriesGameNumber: Int,
    @SerialName("status")
    val status: Status,
    @SerialName("teams")
    val teams: Teams,
    @SerialName("tiebreaker")
    val tiebreaker: String,
    @SerialName("venue")
    val venue: Venue
)