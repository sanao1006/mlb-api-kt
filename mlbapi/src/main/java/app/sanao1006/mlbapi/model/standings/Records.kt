package app.sanao1006.mlbapi.model.standings


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Records(
    @SerialName("divisionRecords")
    val divisionRecords: List<DivisionRecord>,
    @SerialName("expectedRecords")
    val expectedRecords: List<ExpectedRecord>,
    @SerialName("leagueRecords")
    val leagueRecords: List<LeagueRecordX>,
    @SerialName("overallRecords")
    val overallRecords: List<OverallRecord>,
    @SerialName("splitRecords")
    val splitRecords: List<SplitRecord>
)