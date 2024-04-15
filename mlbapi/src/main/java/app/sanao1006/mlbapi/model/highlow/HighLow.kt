package app.sanao1006.mlbapi.model.highlow


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HighLow(
    @SerialName("copyright")
    val copyright: String,
    @SerialName("highLowResults")
    val highLowResults: List<HighLowResult>
)
