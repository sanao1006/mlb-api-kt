package app.sanao1006.mlbapi.model.people


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PersonStatsResponse(
    @SerialName("copyright")
    val copyright: String,
    @SerialName("stats")
    val stats: List<Stat>
)