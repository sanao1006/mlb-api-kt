package app.sanao1006.mlbapi.model.people


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Coordinates(
    @SerialName("coordX")
    val coordX: Double,
    @SerialName("coordY")
    val coordY: Double
)