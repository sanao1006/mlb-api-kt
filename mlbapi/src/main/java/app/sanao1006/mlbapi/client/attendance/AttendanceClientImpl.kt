package app.sanao1006.mlbapi.client.attendance

import app.sanao1006.mlbapi.model.attendance.Attendance
import app.sanao1006.mlbapi.model.award.Award
import app.sanao1006.mlbapi.model.award.Awards
import com.skydoves.sandwich.ApiResponse
import com.skydoves.sandwich.getOrThrow
import com.skydoves.sandwich.onSuccess
import java.net.ConnectException

class AttendanceClientImpl(
    private val attendanceClient: AttendanceClient
) {
    suspend fun getAttendance(
        leagueId: Int,
        teamId: Int,
        leagueListId: String
    ): Attendance = attendanceClient.getAttendance(
        teamId = teamId,
        leagueId = leagueId,
        leagueListId = leagueListId).getOrThrow()

}
