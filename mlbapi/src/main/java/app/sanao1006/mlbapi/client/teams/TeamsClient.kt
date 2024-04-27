package app.sanao1006.mlbapi.client.teams

import app.sanao1006.mlbapi.model.teams.TeamsHistoryResponse
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

    @GET("teams/history")
    suspend fun getTeamsHistory(
        @Query("teamIds") teamIds: Int,
        @Query("startSeason") startSeason: String?,
        @Query("endSeason") endSeason: String?,
        @Query("fields") fields: String?,
    ): ApiResponse<TeamsHistoryResponse>
}