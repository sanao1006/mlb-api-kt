package app.sanao1006.mlbapi.model.venue


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class VenueResponse(
    @SerialName("copyright")
    val copyright: String,
    @SerialName("venues")
    val venues: List<Venue>
)