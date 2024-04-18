package app.sanao1006.mlbapi.client.people

import app.sanao1006.mlbapi.model.people.PeopleFreeAgentsResponse
import app.sanao1006.mlbapi.model.people.PeopleResponse
import app.sanao1006.mlbapi.model.people.PersonStatsResponse
import com.skydoves.sandwich.ApiResponse
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.Path
import de.jensklingenberg.ktorfit.http.Query

interface PeopleClient {
    @GET("people")
    suspend fun getPeople(
        @Query("personIds") personIds: Int
    ): ApiResponse<PeopleResponse>

    @GET("people/freeAgents")
    suspend fun getPeopleFreeAgents(
        @Query("leagueId") leagueId: Int,
        @Query("season") season: Int
    ): ApiResponse<PeopleFreeAgentsResponse>

    @GET("people/{personId}")
    suspend fun getPerson(@Path("personId") personId: Int): ApiResponse<PeopleResponse>

    @GET("people/{personId}/stats/game/{gamePk}")
    suspend fun getPersonStats(
        @Path("personId") personId: Int,
        @Path("gamePk") gamePk: Int
    ): ApiResponse<PersonStatsResponse>
}
