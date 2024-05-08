package app.sanao1006.mlbapi.model.venue


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Venue(
    @SerialName("active")
    val active: Boolean,
    @SerialName("id")
    val id: Int,
    @SerialName("link")
    val link: String,
    @SerialName("name")
    val name: String,
    @SerialName("season")
    val season: String
)