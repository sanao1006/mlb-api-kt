package app.sanao1006.mlbapi.model.people


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Breaks(
    @SerialName("breakAngle")
    val breakAngle: Double,
    @SerialName("breakHorizontal")
    val breakHorizontal: Double,
    @SerialName("breakLength")
    val breakLength: Double,
    @SerialName("breakVertical")
    val breakVertical: Double,
    @SerialName("breakVerticalInduced")
    val breakVerticalInduced: Double,
    @SerialName("breakY")
    val breakY: Double,
    @SerialName("spinDirection")
    val spinDirection: Int,
    @SerialName("spinRate")
    val spinRate: Int
)