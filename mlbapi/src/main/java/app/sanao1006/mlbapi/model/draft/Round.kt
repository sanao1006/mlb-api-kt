package app.sanao1006.mlbapi.model.draft


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Round(
    @SerialName("picks")
    val picks: List<Pick>,
    @SerialName("round")
    val round: String
)