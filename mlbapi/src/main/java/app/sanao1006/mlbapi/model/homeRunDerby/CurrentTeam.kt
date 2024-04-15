package app.sanao1006.mlbapi.model.homeRunDerby


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CurrentTeam(
    @SerialName("abbreviation")
    val abbreviation: String,
    @SerialName("active")
    val active: Boolean,
    @SerialName("allStarStatus")
    val allStarStatus: String,
    @SerialName("clubName")
    val clubName: String,
    @SerialName("division")
    val division: Division,
    @SerialName("fileCode")
    val fileCode: String,
    @SerialName("firstYearOfPlay")
    val firstYearOfPlay: String,
    @SerialName("franchiseName")
    val franchiseName: String,
    @SerialName("id")
    val id: Int,
    @SerialName("league")
    val league: League,
    @SerialName("link")
    val link: String,
    @SerialName("locationName")
    val locationName: String,
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