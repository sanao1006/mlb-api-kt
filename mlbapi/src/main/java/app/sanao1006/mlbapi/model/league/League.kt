package app.sanao1006.mlbapi.model.league


import app.sanao1006.mlbapi.model.Sport
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class League(
    @SerialName("abbreviation")
    val abbreviation: String,
    @SerialName("active")
    val active: Boolean,
    @SerialName("conferencesInUse")
    val conferencesInUse: Boolean,
    @SerialName("divisionsInUse")
    val divisionsInUse: Boolean,
    @SerialName("hasPlayoffPoints")
    val hasPlayoffPoints: Boolean,
    @SerialName("hasSplitSeason")
    val hasSplitSeason: Boolean,
    @SerialName("hasWildCard")
    val hasWildCard: Boolean,
    @SerialName("id")
    val id: Int,
    @SerialName("link")
    val link: String,
    @SerialName("name")
    val name: String,
    @SerialName("nameShort")
    val nameShort: String,
    @SerialName("numGames")
    val numGames: Int,
    @SerialName("numTeams")
    val numTeams: Int,
    @SerialName("numWildcardTeams")
    val numWildcardTeams: Int,
    @SerialName("orgCode")
    val orgCode: String,
    @SerialName("season")
    val season: String,
    @SerialName("seasonDateInfo")
    val seasonDateInfo: SeasonDateInfo,
    @SerialName("seasonState")
    val seasonState: String,
    @SerialName("sortOrder")
    val sortOrder: Int,
    @SerialName("sport")
    val sport: Sport
)