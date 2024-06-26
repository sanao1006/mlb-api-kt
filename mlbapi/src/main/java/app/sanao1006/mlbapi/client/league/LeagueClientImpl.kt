package app.sanao1006.mlbapi.client.league

import app.sanao1006.mlbapi.model.league.AllStarBallotResponse
import app.sanao1006.mlbapi.model.league.AllStarFinalVoteResponse
import app.sanao1006.mlbapi.model.league.AllStarWriteInsResponse
import app.sanao1006.mlbapi.model.league.League
import app.sanao1006.mlbapi.model.league.Leagues
import app.sanao1006.mlbapi.model.league.People
import com.skydoves.sandwich.ApiResponse
import java.net.ConnectException

class LeagueClientImpl(
    private val leagueClient: LeagueClient
) {
    suspend fun getLeagues(sportId: Int, leagueIds: Int): List<League> =
        leagueClient.getLeagues(sportId = sportId, leagueIds = leagueIds).toList()

    suspend fun getAllStartBallot(leagueId: Int, season: Int): List<People> =
        leagueClient.getLeagueAllStarBallot(leagueId = leagueId, season = season).toList()

    suspend fun getAllStarWriteIns(leagueId: Int, season: Int): List<People> =
        leagueClient.getLeagueAllStarWriteIns(leagueId = leagueId, season = season).toList()

    suspend fun getAllStartFinalVote(leagueId: Int, season: Int): List<People> =
        leagueClient.getLeagueAllStarFinalVote(leagueId = leagueId, season = season).toList()


    companion object {
        fun ApiResponse<Leagues>.toList(): List<League> {
            return when (this) {
                is ApiResponse.Success -> this.data.leagues
                is ApiResponse.Failure -> throw ConnectException("connection error")
            }
        }

        @JvmName("AllStarBallotResponseToListPeople")
        fun ApiResponse<AllStarBallotResponse>.toList(): List<People> {
            return when (this) {
                is ApiResponse.Success -> this.data.people
                is ApiResponse.Failure -> throw ConnectException("connection error")
            }
        }

        @JvmName("AllStarWriteInsResponseToListPeople")
        fun ApiResponse<AllStarWriteInsResponse>.toList(): List<People> {
            return when (this) {
                is ApiResponse.Success -> this.data.people
                is ApiResponse.Failure -> throw ConnectException("connection error")
            }
        }

        @JvmName("AllStarFinalVoteResponseToListPeople")
        fun ApiResponse<AllStarFinalVoteResponse>.toList(): List<People> {
            return when (this) {
                is ApiResponse.Success -> this.data.people
                is ApiResponse.Failure -> throw ConnectException("connection error")
            }
        }

    }
}
