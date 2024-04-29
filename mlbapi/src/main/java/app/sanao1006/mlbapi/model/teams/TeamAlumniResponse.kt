package app.sanao1006.mlbapi.model.teams


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TeamAlumniResponse(
    @SerialName("copyright")
    val copyright: String,
    @SerialName("people")
    val people: List<People>
)