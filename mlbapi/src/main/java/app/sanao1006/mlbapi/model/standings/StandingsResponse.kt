package app.sanao1006.mlbapi.model.standings


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class StandingsResponse(
    @SerialName("copyright")
    val copyright: String,
    @SerialName("records")
    val records: List<Record>
)