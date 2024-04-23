package app.sanao1006.mlbapi.model.stats


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class StatsResponse(
    @SerialName("copyright")
    val copyright: String,
    @SerialName("stats")
    val stats: List<Stat>
)