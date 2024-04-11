package app.sanao1006.mlbapi.model.divisions


import app.sanao1006.mlbapi.model.League
import app.sanao1006.mlbapi.model.Sport
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Division(
    @SerialName("abbreviation")
    val abbreviation: String,
    @SerialName("active")
    val active: Boolean,
    @SerialName("hasWildcard")
    val hasWildcard: Boolean,
    @SerialName("id")
    val id: Int,
    @SerialName("league")
    val league: League,
    @SerialName("link")
    val link: String,
    @SerialName("name")
    val name: String,
    @SerialName("nameShort")
    val nameShort: String,
    @SerialName("numPlayoffTeams")
    val numPlayoffTeams: Int? = null,
    @SerialName("season")
    val season: String,
    @SerialName("sortOrder")
    val sortOrder: Int,
    @SerialName("sport")
    val sport: Sport
)