package app.sanao1006.mlbapi.model.seasons


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SeasonAll(
    @SerialName("allStarDate")
    val allStarDate: String? = null,
    @SerialName("firstDate2ndHalf")
    val firstDate2ndHalf: String? = null,
    @SerialName("gameLevelGamedayType")
    val gameLevelGamedayType: String,
    @SerialName("hasWildcard")
    val hasWildcard: Boolean,
    @SerialName("lastDate1stHalf")
    val lastDate1stHalf: String? = null,
    @SerialName("offSeasonEndDate")
    val offSeasonEndDate: String,
    @SerialName("offseasonStartDate")
    val offseasonStartDate: String,
    @SerialName("postSeasonEndDate")
    val postSeasonEndDate: String? = null,
    @SerialName("postSeasonStartDate")
    val postSeasonStartDate: String? = null,
    @SerialName("preSeasonEndDate")
    val preSeasonEndDate: String? = null,
    @SerialName("preSeasonStartDate")
    val preSeasonStartDate: String,
    @SerialName("qualifierOutsPitched")
    val qualifierOutsPitched: Double,
    @SerialName("qualifierPlateAppearances")
    val qualifierPlateAppearances: Double,
    @SerialName("regularSeasonEndDate")
    val regularSeasonEndDate: String,
    @SerialName("regularSeasonStartDate")
    val regularSeasonStartDate: String,
    @SerialName("seasonEndDate")
    val seasonEndDate: String,
    @SerialName("seasonId")
    val seasonId: String,
    @SerialName("seasonLevelGamedayType")
    val seasonLevelGamedayType: String,
    @SerialName("seasonStartDate")
    val seasonStartDate: String,
    @SerialName("springEndDate")
    val springEndDate: String? = null,
    @SerialName("springStartDate")
    val springStartDate: String? = null
)