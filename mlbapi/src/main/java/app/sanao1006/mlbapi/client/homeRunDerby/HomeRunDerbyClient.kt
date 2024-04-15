package app.sanao1006.mlbapi.client.homeRunDerby

import app.sanao1006.mlbapi.model.homeRunDerby.HomeRunDerby
import com.skydoves.sandwich.ApiResponse
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.Path

interface HomeRunDerbyClient {
    @GET("homeRunDerby/{gamePk}")
    suspend fun getHomeRunDerby(
        @Path("gamePk") gamePk: Int
    ): ApiResponse<HomeRunDerby>
}