package app.sanao1006.mlbapi.model.people


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HitData(
    @SerialName("coordinates")
    val coordinates: Coordinates,
    @SerialName("hardness")
    val hardness: String,
    @SerialName("launchAngle")
    val launchAngle: Double,
    @SerialName("launchSpeed")
    val launchSpeed: Double,
    @SerialName("location")
    val location: String,
    @SerialName("totalDistance")
    val totalDistance: Double,
    @SerialName("trajectory")
    val trajectory: String
)