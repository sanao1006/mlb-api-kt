package app.sanao1006.mlbapi.model.attendance


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Record(
    @SerialName("attendanceAverageAway")
    val attendanceAverageAway: Int,
    @SerialName("attendanceAverageHome")
    val attendanceAverageHome: Int,
    @SerialName("attendanceAverageYtd")
    val attendanceAverageYtd: Int,
    @SerialName("attendanceHigh")
    val attendanceHigh: Int,
    @SerialName("attendanceHighDate")
    val attendanceHighDate: String,
    @SerialName("attendanceHighGame")
    val attendanceHighGame: AttendanceHighGame,
    @SerialName("attendanceLow")
    val attendanceLow: Int? = null,
    @SerialName("attendanceLowDate")
    val attendanceLowDate: String? = null,
    @SerialName("attendanceLowGame")
    val attendanceLowGame: AttendanceLowGame? = null,
    @SerialName("attendanceOpeningAverage")
    val attendanceOpeningAverage: Int,
    @SerialName("attendanceTotal")
    val attendanceTotal: Int,
    @SerialName("attendanceTotalAway")
    val attendanceTotalAway: Int,
    @SerialName("attendanceTotalHome")
    val attendanceTotalHome: Int,
    @SerialName("gameType")
    val gameType: GameType,
    @SerialName("gamesAwayTotal")
    val gamesAwayTotal: Int,
    @SerialName("gamesHomeTotal")
    val gamesHomeTotal: Int,
    @SerialName("gamesTotal")
    val gamesTotal: Int,
    @SerialName("openingsTotal")
    val openingsTotal: Int,
    @SerialName("openingsTotalAway")
    val openingsTotalAway: Int,
    @SerialName("openingsTotalHome")
    val openingsTotalHome: Int,
    @SerialName("openingsTotalLost")
    val openingsTotalLost: Int,
    @SerialName("team")
    val team: Team,
    @SerialName("year")
    val year: String
)
