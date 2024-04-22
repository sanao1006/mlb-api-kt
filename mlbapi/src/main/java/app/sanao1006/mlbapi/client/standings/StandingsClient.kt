package app.sanao1006.mlbapi.client.standings

import app.sanao1006.mlbapi.model.standings.StandingsResponse
import com.skydoves.sandwich.ApiResponse
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.Query

interface StandingsClient {
    @GET("standings")
    suspend fun getStandings(
        @Query("leagueId") leagueId: Int
    ): ApiResponse<StandingsResponse>
}