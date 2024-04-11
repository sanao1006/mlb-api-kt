package app.sanao1006.mlbapi.client.divisions

import app.sanao1006.mlbapi.model.conferences.Conference
import app.sanao1006.mlbapi.model.conferences.Conferences
import app.sanao1006.mlbapi.model.divisions.Division
import app.sanao1006.mlbapi.model.divisions.Divisions
import com.skydoves.sandwich.ApiResponse
import java.net.ConnectException

class DivisionsClientImpl(
    private val divisionsClient: DivisionsClient
) {
    suspend fun getDivisions(): List<Division> = divisionsClient.getDivisions().toList()

    companion object {
        fun ApiResponse<Divisions>.toList(): List<Division> {
            return when(this) {
                is ApiResponse.Success ->this.data.divisions
                is ApiResponse.Failure -> throw ConnectException("connection error")
            }
        }
    }
}