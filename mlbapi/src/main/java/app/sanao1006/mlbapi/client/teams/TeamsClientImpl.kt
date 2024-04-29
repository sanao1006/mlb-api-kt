package app.sanao1006.mlbapi.client.teams

import app.sanao1006.mlbapi.model.teams.Coaches
import app.sanao1006.mlbapi.model.teams.People
import app.sanao1006.mlbapi.model.teams.Stat
import app.sanao1006.mlbapi.model.teams.Team
import app.sanao1006.mlbapi.model.teams.TeamAffiliatesResponse
import app.sanao1006.mlbapi.model.teams.TeamAlumniResponse
import app.sanao1006.mlbapi.model.teams.TeamCoachesResponse
import app.sanao1006.mlbapi.model.teams.TeamResponse
import app.sanao1006.mlbapi.model.teams.TeamStatsResponse
import app.sanao1006.mlbapi.model.teams.TeamsHistoryResponse
import app.sanao1006.mlbapi.model.teams.TeamsResponse
import com.skydoves.sandwich.ApiResponse
import java.net.ConnectException
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

    suspend fun getTeamsAffiliates(
        teamIds: Int,
        sportId: Int? = null,
        season: Int? = null,
        hydrate: String? = null,
        fields: String? = null
    ): List<Team> =
        teamsClient.getTeamsAffiliates(
            teamIds = teamIds,
            sportId = sportId,
            season = season,
            hydrate = hydrate,
            fields = fields
        ).toList()

    suspend fun getTeam(
        teamId: Int,
        season: Int? = null,
        sportId: Int? = null,
        hydrate: String? = null,
        fields: String? = null
    ): List<Team> =
        teamsClient.getTeam(
            teamId = teamId,
            season = season,
            sportId = sportId,
            hydrate = hydrate,
            fields = fields
        ).toList()

    suspend fun getTeamAlumni(
        teamId: Int,
        season: Int,
        group: String,
        hydrate: String? = null,
        fields: String? = null
    ): List<People> =
        teamsClient.getTeamAlumni(
            teamId = teamId,
            season = season,
            group = group,
            hydrate = hydrate,
            fields = fields
        ).toList()

    suspend fun getTeamCoaches(
        teamId: Int,
        season: Int? = LocalDateTime.now().year,
        date: String? = null,
        fields: String? = null
    ): Coaches =
        teamsClient.getTeamCoaches(
            teamId = teamId,
            season = season,
            date = date,
            fields = fields
        ).toCoaches()

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
        @JvmName("teamsAffiliatesResponseToTeamList")
        fun ApiResponse<TeamAffiliatesResponse>.toList(): List<Team> {
            return when (this) {
                is ApiResponse.Success -> this.data.teams
                is ApiResponse.Failure -> emptyList()
            }
        }
        @JvmName("teamResponseToTeamList")
        fun ApiResponse<TeamResponse>.toList(): List<Team> {
            return when (this) {
                is ApiResponse.Success -> this.data.teams
                is ApiResponse.Failure -> emptyList()
            }
        }
        @JvmName("teamAlumniResponseToTeamList")
        fun ApiResponse<TeamAlumniResponse>.toList(): List<People> {
            return when (this) {
                is ApiResponse.Success -> this.data.people
                is ApiResponse.Failure -> emptyList()
            }
        }
        @JvmName("teamCoachesResponseToCoaches")
        fun ApiResponse<TeamCoachesResponse>.toCoaches(): Coaches {
            return when (this) {
                is ApiResponse.Success -> Coaches(
                    link = this.data.link,
                    roster = this.data.roster,
                    rosterType = this.data.rosterType,
                    teamId = this.data.teamId
                )
                is ApiResponse.Failure -> throw ConnectException("connection error")
            }
        }
    }
}