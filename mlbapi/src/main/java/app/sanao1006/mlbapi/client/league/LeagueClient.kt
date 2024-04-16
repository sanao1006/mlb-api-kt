package app.sanao1006.mlbapi.client.league

import app.sanao1006.mlbapi.model.league.AllStarBallotResponse
import app.sanao1006.mlbapi.model.league.AllStarFinalVoteResponse
import app.sanao1006.mlbapi.model.league.Leagues
import com.skydoves.sandwich.ApiResponse
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.Path
import de.jensklingenberg.ktorfit.http.Query

interface LeagueClient {
    @GET("league")
    suspend fun getLeagues(
        @Query("sportId") sportId: Int,
        @Query("leagueIds") leagueIds: Int
    ): ApiResponse<Leagues>

    @GET("league/{leagueId}/allStarBallot")
    suspend fun getLeagueAllStarBallot(
        @Path("leagueId") leagueId: Int,
        @Query("season") season: Int
    ): ApiResponse<AllStarBallotResponse>

    @GET("league/{leagueId}/allStarFinalVote")
    suspend fun getLeagueAllStarFinalVote(
        @Path("leagueId") leagueId: Int,
        @Query("season") season: Int
    ): ApiResponse<AllStarFinalVoteResponse>
}