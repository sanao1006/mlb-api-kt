package app.sanao1006.mlbapi.model.homeRunDerby


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TopDerbyHitData(
    @SerialName("coordinates")
    val coordinates: Coordinates? = null,
    @SerialName("launchSpeed")
    val launchSpeed: Double,
    @SerialName("totalDistance")
    val totalDistance: Double
)