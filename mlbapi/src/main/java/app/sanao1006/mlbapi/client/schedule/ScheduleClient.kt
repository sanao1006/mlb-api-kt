package app.sanao1006.mlbapi.client.schedule

import app.sanao1006.mlbapi.model.schedule.ScheduleResponse
import app.sanao1006.mlbapi.model.schedule.ScheduleTiedResponse
import com.skydoves.sandwich.ApiResponse
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.Query

interface ScheduleClient {
    @GET("schedule")
    suspend fun getSchedule(
        @Query("sportId") sportId: Int = 1,
        @Query("gamePk") gamePk: Int?,
        @Query("scheduleType") scheduleType: String?,
        @Query("eventTypes") eventTypes: String?,
        @Query("hydrate") hydrate: String?,
        @Query("teamId") teamId: Int?,
        @Query("leagueId") leagueId: Int?,
        @Query("venueIds") venueIds: Int?,
        @Query("gameTypes") gameTypes: String?,
        @Query("date") date: String?,
        @Query("startDate") startDate: String?,
        @Query("endDate") endDate: String?,
        @Query("opponentId") opponentId: String?,
        @Query("fields") fields: String?,
    ): ApiResponse<ScheduleResponse>

    @GET("schedule/games/tied")
    suspend fun getScheduleTied(
        @Query("season") season: Int,
        @Query("gameTypes") gameTypes: String,
        @Query("hydrate") hydrate: String?,
        @Query("fields") fields: String?,
    ): ApiResponse<ScheduleTiedResponse>
}
