package app.sanao1006.mlbapi.client.people

import app.sanao1006.mlbapi.model.people.PeopleResponse
import com.skydoves.sandwich.ApiResponse
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.Query

interface PeopleClient {
    @GET("people")
    suspend fun getPeople(
        @Query("personIds") personIds: Int
    ): ApiResponse<PeopleResponse>
}
