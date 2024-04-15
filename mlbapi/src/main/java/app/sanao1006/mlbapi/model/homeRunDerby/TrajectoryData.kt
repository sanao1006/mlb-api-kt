package app.sanao1006.mlbapi.model.homeRunDerby


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TrajectoryData(
    @SerialName("measuredTimeInterval")
    val measuredTimeInterval: List<Double>,
    @SerialName("trajectoryPolynomialX")
    val trajectoryPolynomialX: List<Double>,
    @SerialName("trajectoryPolynomialY")
    val trajectoryPolynomialY: List<Double>,
    @SerialName("trajectoryPolynomialZ")
    val trajectoryPolynomialZ: List<Double>,
    @SerialName("validTimeInterval")
    val validTimeInterval: List<Double>
)