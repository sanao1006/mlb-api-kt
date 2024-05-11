package app.sanao1006.mlbapi.client.schedule

import app.sanao1006.mlbapi.model.GameType
import app.sanao1006.mlbapi.model.schedule.Schedule
import app.sanao1006.mlbapi.model.schedule.ScheduleResponse
import app.sanao1006.mlbapi.model.schedule.ScheduleTied
import app.sanao1006.mlbapi.model.schedule.ScheduleTiedResponse
import com.skydoves.sandwich.ApiResponse
import java.net.ConnectException

class ScheduleClientImpl(
    private val scheduleClient: ScheduleClient
) {
    suspend fun getSchedule(
        gamePk: Int? = null,
        scheduleType: String? = null,
        eventTypes: String? = null,
        hydrate: String? = null,
        teamId: Int? = null,
        leagueId: Int? = null,
        venueIds: Int? = null,
        gameTypes: String? = null,
        date: String? = null,
        startDate: String? = null,
        endDate: String? = null,
        opponentId: String? = null,
        fields: String? = null,
    ): Schedule =
        scheduleClient.getSchedule(
            gamePk = gamePk,
            scheduleType = scheduleType,
            eventTypes = eventTypes,
            hydrate = hydrate,
            teamId = teamId,
            leagueId = leagueId,
            venueIds = venueIds,
            gameTypes = gameTypes,
            date = date,
            startDate = startDate,
            endDate = endDate,
            opponentId = opponentId,
            fields = fields
        ).toSchedule()

    suspend fun getScheduleTied(
        season: Int,
        gameTypes: GameType,
        hydrate: String? = null,
        fields: String? = null
    ): ScheduleTied =
        scheduleClient.getScheduleTied(
            season = season,
            gameTypes = gameTypes.value,
            hydrate = hydrate,
            fields = fields
        ).toScheduleTied()

    private fun ApiResponse<ScheduleResponse>.toSchedule(): Schedule =
        when (this) {
            is ApiResponse.Success -> Schedule(
                dates = this.data.dates,
                totalEvents = this.data.totalEvents,
                totalGames = this.data.totalGames,
                totalItems = this.data.totalItems,
                totalGamesInProgress = this.data.totalGamesInProgress
            )
            is ApiResponse.Failure -> throw ConnectException("connection error")
        }

    private fun ApiResponse<ScheduleTiedResponse>.toScheduleTied(): ScheduleTied =
        when (this) {
            is ApiResponse.Success -> ScheduleTied(
                dates = this.data.dates,
                totalEvents = this.data.totalEvents,
                totalGames = this.data.totalGames,
                totalItems = this.data.totalItems,
                totalGamesInProgress = this.data.totalGamesInProgress
            )
            is ApiResponse.Failure -> throw ConnectException("connection error")
        }
}