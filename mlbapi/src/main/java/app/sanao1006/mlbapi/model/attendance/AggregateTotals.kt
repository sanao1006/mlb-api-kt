package app.sanao1006.mlbapi.model.attendance


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AggregateTotals(
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
    @SerialName("attendanceTotal")
    val attendanceTotal: Int,
    @SerialName("attendanceTotalAway")
    val attendanceTotalAway: Int,
    @SerialName("attendanceTotalHome")
    val attendanceTotalHome: Int,
    @SerialName("openingsTotalAway")
    val openingsTotalAway: Int,
    @SerialName("openingsTotalHome")
    val openingsTotalHome: Int,
    @SerialName("openingsTotalLost")
    val openingsTotalLost: Int,
    @SerialName("openingsTotalYtd")
    val openingsTotalYtd: Int
)
