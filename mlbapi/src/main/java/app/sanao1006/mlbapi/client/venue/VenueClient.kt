package app.sanao1006.mlbapi.client.venue

import app.sanao1006.mlbapi.model.venue.VenueResponse
import com.skydoves.sandwich.ApiResponse
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.Query

interface VenueClient {
    @GET("venues")
    suspend fun getVenues(
        @Query("venueIds") venueIds: Int?,
        @Query("season") season: Int?,
        @Query("hydrate") hydrate: String?,
        @Query("fields") fields: String?
    ) :ApiResponse<VenueResponse>
}