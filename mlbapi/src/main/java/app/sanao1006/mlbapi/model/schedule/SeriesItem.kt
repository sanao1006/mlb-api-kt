package app.sanao1006.mlbapi.model.schedule


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SeriesItem(
    @SerialName("gameType")
    val gameType: String,
    @SerialName("id")
    val id: String,
    @SerialName("isDefault")
    val isDefault: Boolean,
    @SerialName("sortNumber")
    val sortNumber: Int
)
