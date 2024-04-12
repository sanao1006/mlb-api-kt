package app.sanao1006.mlbapi.model.draft


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Drafts(
    @SerialName("draftYear")
    val draftYear: Int,
    @SerialName("rounds")
    val rounds: List<Round>
)