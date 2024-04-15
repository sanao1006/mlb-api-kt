package app.sanao1006.mlbapi.client.highlow

import app.sanao1006.mlbapi.client.draft.DraftClientImpl.Companion.toDrafts
import app.sanao1006.mlbapi.model.highlow.HighLow
import app.sanao1006.mlbapi.model.highlow.HighLowResult
import com.skydoves.sandwich.ApiResponse
import java.net.ConnectException

class HighLowClientImpl(
    private val highLowClient: HighLowClient
) {
    suspend fun getHighLow(orgType: String): List<HighLowResult> =
        highLowClient.getHighLow(orgType).toList()

    companion object {
        fun ApiResponse<HighLow>.toList(): List<HighLowResult> {
            return when(this) {
                is ApiResponse.Success ->this.data.highLowResults
                is ApiResponse.Failure -> throw ConnectException("connection error")
            }
        }
    }
}
