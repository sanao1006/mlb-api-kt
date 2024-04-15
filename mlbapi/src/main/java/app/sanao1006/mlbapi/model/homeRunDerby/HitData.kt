package app.sanao1006.mlbapi.model.homeRunDerby


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HitData(
    @SerialName("coordinates")
    val coordinates: Coordinates,
    @SerialName("launchAngle")
    val launchAngle: Double? = null,
    @SerialName("launchSpeed")
    val launchSpeed: Double? = null,
    @SerialName("totalDistance")
    val totalDistance: Double,
    @SerialName("trajectoryData")
    val trajectoryData: TrajectoryData? = null
)