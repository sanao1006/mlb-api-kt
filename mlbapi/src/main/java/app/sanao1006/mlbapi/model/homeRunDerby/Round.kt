package app.sanao1006.mlbapi.model.homeRunDerby


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Round(
    @SerialName("matchups")
    val matchups: List<Matchup>,
    @SerialName("numBatters")
    val numBatters: Int,
    @SerialName("round")
    val round: Int
)