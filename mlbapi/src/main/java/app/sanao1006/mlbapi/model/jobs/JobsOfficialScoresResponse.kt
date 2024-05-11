package app.sanao1006.mlbapi.model.jobs


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class JobsOfficialScoresResponse(
    @SerialName("copyright")
    val copyright: String,
    @SerialName("roster")
    val roster: List<Roster>
)