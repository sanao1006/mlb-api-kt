package app.sanao1006.mlbapi.model.standings


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Record(
    @SerialName("division")
    val division: Division,
    @SerialName("lastUpdated")
    val lastUpdated: String,
    @SerialName("league")
    val league: League,
    @SerialName("sport")
    val sport: Sport,
    @SerialName("standingsType")
    val standingsType: String,
    @SerialName("teamRecords")
    val teamRecords: List<TeamRecord>
)