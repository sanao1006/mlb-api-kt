package app.sanao1006.mlbapi.model.divisions


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Divisions(
    @SerialName("copyright")
    val copyright: String,
    @SerialName("divisions")
    val divisions: List<Division>
)