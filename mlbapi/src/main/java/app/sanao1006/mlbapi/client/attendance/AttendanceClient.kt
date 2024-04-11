package app.sanao1006.mlbapi.client.attendance

import app.sanao1006.mlbapi.model.attendance.Attendance
import com.skydoves.sandwich.ApiResponse
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.Query

interface AttendanceClient {
    @GET("attendance")
    suspend fun getAttendance(
        @Query("teamId") teamId: Int,
        @Query("leagueId") leagueId: Int,
        @Query("leagueListId") leagueListId: String
    ): ApiResponse<Attendance>
}
