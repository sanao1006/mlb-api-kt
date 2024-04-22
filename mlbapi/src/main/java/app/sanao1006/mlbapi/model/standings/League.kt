package app.sanao1006.mlbapi.model.standings


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class League(
    @SerialName("id")
    val id: Int,
    @SerialName("link")
    val link: String
)