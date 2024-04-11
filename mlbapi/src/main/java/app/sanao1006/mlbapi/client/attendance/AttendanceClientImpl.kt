package app.sanao1006.mlbapi.client.attendance

import app.sanao1006.mlbapi.model.attendance.Attendance
import com.skydoves.sandwich.getOrThrow

class AttendanceClientImpl(
    private val attendanceClient: AttendanceClient
) {
    suspend fun getAttendance(
        teamId: Int,
        leagueId: Int,
        leagueListId: String
    ): Attendance = attendanceClient.getAttendance(
        teamId = teamId,
        leagueId = leagueId,
        leagueListId = leagueListId).getOrThrow()

}
