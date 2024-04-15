package app.sanao1006.mlbapi.model.homeRunDerby


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Metric(
    @SerialName("averageValue")
    val averageValue: Double,
    @SerialName("group")
    val group: String,
    @SerialName("maxValue")
    val maxValue: Double,
    @SerialName("metricId")
    val metricId: Int,
    @SerialName("minValue")
    val minValue: Double,
    @SerialName("name")
    val name: String,
    @SerialName("unit")
    val unit: String
)