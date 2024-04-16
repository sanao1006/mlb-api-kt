package app.sanao1006.mlbapi.client.league

import app.sanao1006.mlbapi.model.award.Award
import app.sanao1006.mlbapi.model.award.Awards
import app.sanao1006.mlbapi.model.league.League
import app.sanao1006.mlbapi.model.league.Leagues
import com.skydoves.sandwich.ApiResponse
import java.net.ConnectException

class LeagueClientImpl(
    private val leagueClient: LeagueClient
) {
    suspend fun getLeagues(sportId: Int, leagueIds: Int): List<League> =
        leagueClient.getLeagues(sportId = sportId, leagueIds = leagueIds).toList()

    companion object {
        fun ApiResponse<Leagues>.toList(): List<League> {
            return when (this) {
                is ApiResponse.Success -> this.data.leagues
                is ApiResponse.Failure -> throw ConnectException("connection error")
            }
        }
    }
}
