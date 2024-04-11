package app.sanao1006.mlbapi.client.conferences

import app.sanao1006.mlbapi.model.conferences.Conference
import app.sanao1006.mlbapi.model.conferences.Conferences
import com.skydoves.sandwich.ApiResponse
import java.net.ConnectException

class ConferencesClientImpl(
    private val conferencesClient: ConferencesClient
) {
    suspend fun getConferences(): List<Conference> = conferencesClient.getConferences().toList()

    companion object {
        fun ApiResponse<Conferences>.toList(): List<Conference> {
            return when(this) {
                is ApiResponse.Success ->this.data.conferences
                is ApiResponse.Failure -> throw ConnectException("connection error")
            }
        }
    }
}
