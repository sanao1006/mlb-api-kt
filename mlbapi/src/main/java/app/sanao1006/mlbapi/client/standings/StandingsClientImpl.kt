package app.sanao1006.mlbapi.client.standings

import app.sanao1006.mlbapi.model.standings.Record
import app.sanao1006.mlbapi.model.standings.StandingsResponse
import com.skydoves.sandwich.ApiResponse
import java.net.ConnectException

class StandingsClientImpl(
    private val standingsClient: StandingsClient
) {
    suspend fun getStandings(leagueId: Int): List<Record> =
        standingsClient.getStandings(leagueId = leagueId).toList()

    companion object {
        fun ApiResponse<StandingsResponse>.toList(): List<Record> {
            return when (this) {
                is ApiResponse.Success -> this.data.records
                is ApiResponse.Failure -> throw ConnectException("connection error")
            }
        }
    }
}