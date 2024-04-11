package app.sanao1006.mlbapi.model.attendance


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Attendance(
    @SerialName("aggregateTotals")
    val aggregateTotals: AggregateTotals,
//    @SerialName("copyright")
    val copyright: String,
    @SerialName("records")
    val records: List<Record>
)
