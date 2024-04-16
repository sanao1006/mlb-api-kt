package app.sanao1006.mlbapi.model.league


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AllStarFinalVoteResponse(
    @SerialName("copyright")
    val copyright: String,
    @SerialName("people")
    val people: List<People>
)
