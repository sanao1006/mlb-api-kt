package app.sanao1006.mlbapi.model.people


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PeopleResponse(
    @SerialName("copyright")
    val copyright: String,
    @SerialName("people")
    val people: List<People>
)