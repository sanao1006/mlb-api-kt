package app.sanao1006.mlbapi.model.teams


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Team(
    @SerialName("abbreviation")
    val abbreviation: String,
    @SerialName("active")
    val active: Boolean,
    @SerialName("allStarStatus")
    val allStarStatus: String? = null,
    @SerialName("clubName")
    val clubName: String? = null,
    @SerialName("division")
    val division: Division? = null,
    @SerialName("fileCode")
    val fileCode: String? = null,
    @SerialName("firstYearOfPlay")
    val firstYearOfPlay: String? = null,
    @SerialName("franchiseName")
    val franchiseName: String? = null,
    @SerialName("id")
    val id: Int,
    @SerialName("league")
    val league: League,
    @SerialName("link")
    val link: String,
    @SerialName("locationName")
    val locationName: String? = null,
    @SerialName("name")
    val name: String,
    @SerialName("parentOrgId")
    val parentOrgId: Int? = null,
    @SerialName("parentOrgName")
    val parentOrgName: String? = null,
    @SerialName("season")
    val season: Int,
    @SerialName("shortName")
    val shortName: String,
    @SerialName("sport")
    val sport: Sport,
    @SerialName("springLeague")
    val springLeague: SpringLeague? = null,
    @SerialName("springVenue")
    val springVenue: SpringVenue? = null,
    @SerialName("teamCode")
    val teamCode: String,
    @SerialName("teamName")
    val teamName: String,
    @SerialName("venue")
    val venue: Venue
)