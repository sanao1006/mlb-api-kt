package app.sanao1006.mlbapi.model.teams


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Roster(
    @SerialName("jerseyNumber")
    val jerseyNumber: String,
    @SerialName("job")
    val job: String,
    @SerialName("jobId")
    val jobId: String,
    @SerialName("person")
    val person: Person,
    @SerialName("title")
    val title: String
)