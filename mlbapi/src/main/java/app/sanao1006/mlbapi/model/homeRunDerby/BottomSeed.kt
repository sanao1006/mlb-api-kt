package app.sanao1006.mlbapi.model.homeRunDerby


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BottomSeed(
    @SerialName("complete")
    val complete: Boolean,
    @SerialName("hits")
    val hits: List<Hit>,
    @SerialName("isComplete")
    val isComplete: Boolean,
    @SerialName("isStarted")
    val isStarted: Boolean,
    @SerialName("isWinner")
    val isWinner: Boolean,
    @SerialName("numHomeRuns")
    val numHomeRuns: Int,
    @SerialName("order")
    val order: Int,
    @SerialName("player")
    val player: Player,
    @SerialName("seed")
    val seed: Int,
    @SerialName("started")
    val started: Boolean,
    @SerialName("topDerbyHitData")
    val topDerbyHitData: TopDerbyHitData,
    @SerialName("winner")
    val winner: Boolean
)