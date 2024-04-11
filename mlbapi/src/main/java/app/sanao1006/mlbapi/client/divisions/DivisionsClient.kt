package app.sanao1006.mlbapi.client.divisions

import app.sanao1006.mlbapi.model.divisions.Divisions
import com.skydoves.sandwich.ApiResponse
import de.jensklingenberg.ktorfit.http.GET

interface DivisionsClient {
    @GET("divisions")
    suspend fun getDivisions(): ApiResponse<Divisions>
}