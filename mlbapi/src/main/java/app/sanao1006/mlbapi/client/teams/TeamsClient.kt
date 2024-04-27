package app.sanao1006.mlbapi.client.teams

import app.sanao1006.mlbapi.model.teams.TeamsResponse
import com.skydoves.sandwich.ApiResponse
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.Query

interface TeamsClient {
    @GET("teams")
    suspend fun getTeams(
        @Query("season") season: Int,
        @Query("activeStatus") activeStatus: String?= null,
        @Query("leagueIds") leagueIds: Int?= null,
        @Query("sportId") sportId: Int?= null,
        @Query("sportIds") sportIds: Int?= null,
        @Query("gameType") gameType: String?= null,
        @Query("hydrate") hydrate: String?= null,
        @Query("fields") fields: String?= null,
    ): ApiResponse<TeamsResponse>
}