package app.sanao1006.mlbapi.client.sports

import app.sanao1006.mlbapi.model.sports.SportsResponse
import com.skydoves.sandwich.ApiResponse
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.Query

interface SportsClient {
    @GET("sports")
    suspend fun getSports(
        @Query("sportId") sportId: Int?,
        @Query("fields") fields: String?
    ): ApiResponse<SportsResponse>
}