package app.sanao1006.mlbapi.client.conferences

import app.sanao1006.mlbapi.model.conferences.Conferences
import com.skydoves.sandwich.ApiResponse
import de.jensklingenberg.ktorfit.http.GET

interface ConferencesClient {
    @GET("conferences")
    suspend fun getConferences(): ApiResponse<Conferences>

}
