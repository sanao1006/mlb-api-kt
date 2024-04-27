package app.sanao1006.mlbapi.client.teams

import app.sanao1006.mlbapi.model.teams.Stat
import app.sanao1006.mlbapi.model.teams.Team
import app.sanao1006.mlbapi.model.teams.TeamStatsResponse
import app.sanao1006.mlbapi.model.teams.TeamsHistoryResponse
import app.sanao1006.mlbapi.model.teams.TeamsResponse
import com.skydoves.sandwich.ApiResponse
import java.time.LocalDateTime

class TeamsClientImpl(
    private val teamsClient: TeamsClient
) {
    suspend fun getTeams(): List<Team> =
        teamsClient.getTeams(season = LocalDateTime.now().year).toList()

    suspend fun getTeamsHistory(
        teamIds: Int,
        startSeason: String? = null,
        endSeason: String? = null,
        fields: String? = null
    ): List<Team> =
        teamsClient.getTeamsHistory(
            teamIds = teamIds,
            startSeason = startSeason,
            endSeason = endSeason,
            fields = fields
        ).toList()

    suspend fun getTeamsStats(
        season: Int,
        group: String,
        stats: String,
        gameType: String? = null,
        order: String? = null,
        sortStat: String? = null,
        fields: String? = null
    ): List<Stat> =
        teamsClient.getTeamsStats(
            season = season,
            group = group,
            stats = stats,
            sportIds = 1,
            gameType = gameType,
            order = order,
            sortStat = sortStat,
            fields = fields
        ).toList()

    companion object {
        fun ApiResponse<TeamsResponse>.toList(): List<Team> {
            return when (this) {
                is ApiResponse.Success -> this.data.teams
                is ApiResponse.Failure -> emptyList()
            }
        }
        @JvmName("teamsHistoryResponseToTeamList")
        fun ApiResponse<TeamsHistoryResponse>.toList(): List<Team> {
            return when (this) {
                is ApiResponse.Success -> this.data.teams
                is ApiResponse.Failure -> emptyList()
            }
        }
        @JvmName("teamsStatsResponseToStatList")
        fun ApiResponse<TeamStatsResponse>.toList(): List<Stat> {
            return when (this) {
                is ApiResponse.Success -> this.data.stats
                is ApiResponse.Failure -> emptyList()
            }
        }
    }
}