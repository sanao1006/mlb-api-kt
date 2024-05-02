package app.sanao1006.mlbapi.model.seasons


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Season(
    @SerialName("allStarDate")
    val allStarDate: String,
    @SerialName("firstDate2ndHalf")
    val firstDate2ndHalf: String,
    @SerialName("gameLevelGamedayType")
    val gameLevelGamedayType: String,
    @SerialName("hasWildcard")
    val hasWildcard: Boolean,
    @SerialName("lastDate1stHalf")
    val lastDate1stHalf: String,
    @SerialName("offSeasonEndDate")
    val offSeasonEndDate: String,
    @SerialName("offseasonStartDate")
    val offseasonStartDate: String,
    @SerialName("postSeasonEndDate")
    val postSeasonEndDate: String,
    @SerialName("postSeasonStartDate")
    val postSeasonStartDate: String,
    @SerialName("preSeasonEndDate")
    val preSeasonEndDate: String,
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
    val springEndDate: String,
    @SerialName("springStartDate")
    val springStartDate: String
)