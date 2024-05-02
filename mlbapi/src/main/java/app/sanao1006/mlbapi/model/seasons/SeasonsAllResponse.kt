package app.sanao1006.mlbapi.model.seasons


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SeasonsAllResponse(
    @SerialName("copyright")
    val copyright: String,
    @SerialName("seasons")
    val seasons: List<SeasonAll>
)