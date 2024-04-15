package app.sanao1006.mlbapi.client.highlow

import app.sanao1006.mlbapi.model.highlow.HighLow
import com.skydoves.sandwich.ApiResponse
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.Path

interface HighLowClient {
    @GET("highLow/{orgType}")
    suspend fun getHighLow(
        @Path("orgType") orgType: String
    ): ApiResponse<HighLow>
}
