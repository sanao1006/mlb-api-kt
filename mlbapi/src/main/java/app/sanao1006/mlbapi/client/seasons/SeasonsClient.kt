package app.sanao1006.mlbapi.client.seasons

import app.sanao1006.mlbapi.model.seasons.SeasonsAllResponse
import app.sanao1006.mlbapi.model.seasons.SeasonsResponse
import com.skydoves.sandwich.ApiResponse
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.Query

interface SeasonsClient {
    @GET("seasons")
    suspend fun getSeasons(
        @Query("sportId") sportId: Int,
        @Query("season") season: Int?,
        @Query("divisionId") divisionId: Int?,
        @Query("leagueId") leagueId: Int?,
        @Query("fields") fields: String?
    ): ApiResponse<SeasonsResponse>

    @GET("seasons/all")
    suspend fun getSeasonsAll(
        @Query("sportId") sportId: Int,
        @Query("season") season: Int?,
        @Query("divisionId") divisionId: Int?,
        @Query("leagueId") leagueId: Int?,
        @Query("fields") fields: String?
    ): ApiResponse<SeasonsAllResponse>
}