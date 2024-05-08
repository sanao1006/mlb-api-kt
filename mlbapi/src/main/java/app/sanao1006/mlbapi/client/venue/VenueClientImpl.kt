package app.sanao1006.mlbapi.client.venue

import app.sanao1006.mlbapi.model.venue.Venue
import app.sanao1006.mlbapi.model.venue.VenueResponse
import com.skydoves.sandwich.ApiResponse

class VenueClientImpl(
    private val venueClient: VenueClient
) {
    suspend fun getVenues(
        venueIds: Int? = null,
        season: Int? = null,
        hydrate: String? = null,
        fields: String? = null
    ): List<Venue> =
        venueClient.getVenues(
            venueIds = venueIds,
            season = season,
            hydrate = hydrate,
            fields = fields
        ).toList()

    private fun ApiResponse<VenueResponse>.toList(): List<Venue> {
        return when (this) {
            is ApiResponse.Success -> this.data.venues
            is ApiResponse.Failure -> emptyList()
        }
    }
}
