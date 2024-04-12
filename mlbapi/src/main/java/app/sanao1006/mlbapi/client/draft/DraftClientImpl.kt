package app.sanao1006.mlbapi.client.draft

import app.sanao1006.mlbapi.model.draft.Draft
import app.sanao1006.mlbapi.model.draft.Drafts
import com.skydoves.sandwich.ApiResponse
import java.net.ConnectException
import java.time.LocalDateTime

class DraftClientImpl(
    private val draftClient: DraftClient
) {
    suspend fun getDrafts(
        year: Int = LocalDateTime.now().year
    ): Drafts = draftClient.getDrafts(year = year).toDrafts()

    companion object {
        fun ApiResponse<Draft>.toDrafts(): Drafts {
            return when(this) {
                is ApiResponse.Success ->this.data.drafts
                is ApiResponse.Failure -> throw ConnectException("connection error")
            }
        }
    }
}