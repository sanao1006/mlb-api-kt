package app.sanao1006.mlbapi.model.homeRunDerby


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HomeRunDerby(
    @SerialName("info")
    val info: Info,
    @SerialName("players")
    val players: List<Player>,
    @SerialName("rounds")
    val rounds: List<Round>,
    @SerialName("status")
    val status: Status
)