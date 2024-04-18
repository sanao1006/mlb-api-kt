package app.sanao1006.mlbapi.model.people


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PitchData(
    @SerialName("breaks")
    val breaks: Breaks,
    @SerialName("coordinates")
    val coordinates: CoordinatesX,
    @SerialName("endSpeed")
    val endSpeed: Double,
    @SerialName("extension")
    val extension: Double,
    @SerialName("plateTime")
    val plateTime: Double,
    @SerialName("startSpeed")
    val startSpeed: Double,
    @SerialName("strikeZoneBottom")
    val strikeZoneBottom: Double,
    @SerialName("strikeZoneTop")
    val strikeZoneTop: Double,
    @SerialName("typeConfidence")
    val typeConfidence: Double,
    @SerialName("zone")
    val zone: Int
)