package app.sanao1006.mlbapi.client.teams

import app.sanao1006.mlbapi.model.teams.Team
import app.sanao1006.mlbapi.model.teams.TeamsResponse
import com.skydoves.sandwich.ApiResponse
import java.time.LocalDateTime

class TeamsClientImpl(
    private val teamsClient: TeamsClient
) {
    suspend fun getTeams(): List<Team> =
        teamsClient.getTeams(season = LocalDateTime.now().year).toList()

    companion object {
        fun ApiResponse<TeamsResponse>.toList(): List<Team> {
            return when (this) {
                is ApiResponse.Success -> this.data.teams
                is ApiResponse.Failure -> emptyList()
            }
        }
    }
}