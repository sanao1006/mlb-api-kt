package app.sanao1006.mlbapi.model.seasons


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SeasonsResponse(
    @SerialName("copyright")
    val copyright: String,
    @SerialName("seasons")
    val seasons: List<Season>
)