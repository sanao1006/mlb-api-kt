package app.sanao1006.mlbapi.model.conferences


import app.sanao1006.mlbapi.model.League
import app.sanao1006.mlbapi.model.Sport
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Conference(
    @SerialName("abbreviation")
    val abbreviation: String,
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
    @SerialName("sport")
    val sport: Sport
)
