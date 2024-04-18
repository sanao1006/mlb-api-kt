package app.sanao1006.mlbapi.model.people


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CoordinatesX(
    @SerialName("aX")
    val aX: Double,
    @SerialName("aY")
    val aY: Double,
    @SerialName("aZ")
    val aZ: Double,
    @SerialName("pX")
    val pX: Double,
    @SerialName("pZ")
    val pZ: Double,
    @SerialName("pfxX")
    val pfxX: Double,
    @SerialName("pfxZ")
    val pfxZ: Double,
    @SerialName("vX0")
    val vX0: Double,
    @SerialName("vY0")
    val vY0: Double,
    @SerialName("vZ0")
    val vZ0: Double,
    @SerialName("x")
    val x: Double,
    @SerialName("x0")
    val x0: Double,
    @SerialName("y")
    val y: Double,
    @SerialName("y0")
    val y0: Double,
    @SerialName("z0")
    val z0: Double
)