package app.sanao1006.mlbapi.model.league


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Leagues(
    @SerialName("copyright")
    val copyright: String,
    @SerialName("leagues")
    val leagues: List<League>
)