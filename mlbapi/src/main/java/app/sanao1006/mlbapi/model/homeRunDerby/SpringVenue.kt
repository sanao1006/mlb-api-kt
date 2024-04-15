package app.sanao1006.mlbapi.model.homeRunDerby


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SpringVenue(
    @SerialName("id")
    val id: Int,
    @SerialName("link")
    val link: String
)