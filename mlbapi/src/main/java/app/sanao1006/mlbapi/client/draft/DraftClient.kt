package app.sanao1006.mlbapi.client.draft

import app.sanao1006.mlbapi.model.draft.Draft
import com.skydoves.sandwich.ApiResponse
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.Path

interface DraftClient {
    @GET("draft/{year}")
    suspend fun getDrafts(
        @Path("year") year: Int
    ): ApiResponse<Draft>
}