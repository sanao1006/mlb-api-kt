package app.sanao1006.mlbapi.model.people


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PeopleFreeAgentsResponse(
    @SerialName("copyright")
    val copyright: String,
    @SerialName("freeAgents")
    val freeAgents: List<FreeAgent>,
    @SerialName("season")
    val season: String
) {
    fun toPeopleFreeAgents(): PeopleFreeAgents {
        return PeopleFreeAgents(
            freeAgents = this.freeAgents,
            season = this.season
        )
    }
}

data class PeopleFreeAgents(
    val freeAgents: List<FreeAgent>,
    val season: String
)