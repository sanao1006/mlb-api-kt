package app.sanao1006.mlbapi.model.homeRunDerby


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Coordinates(
    @SerialName("coordX")
    val coordX: Double? = null,
    @SerialName("coordY")
    val coordY: Double? = null,
    @SerialName("landingPosX")
    val landingPosX: Double? = null,
    @SerialName("landingPosY")
    val landingPosY: Double? = null
)