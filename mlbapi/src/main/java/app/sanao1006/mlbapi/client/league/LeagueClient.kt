package app.sanao1006.mlbapi.client.league

import app.sanao1006.mlbapi.model.league.Leagues
import com.skydoves.sandwich.ApiResponse
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.Query

interface LeagueClient {
    @GET("league")
    suspend fun getLeagues(
        @Query("sportId") sportId: Int,
        @Query("leagueIds") leagueIds: Int
    ): ApiResponse<Leagues>
}