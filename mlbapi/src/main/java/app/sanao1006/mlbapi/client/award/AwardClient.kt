package app.sanao1006.mlbapi.client.award

import app.sanao1006.mlbapi.model.award.Awards
import com.skydoves.sandwich.ApiResponse
import de.jensklingenberg.ktorfit.http.GET

interface AwardClient {
    @GET("awards")
    suspend fun getAwards(): ApiResponse<Awards>
}
