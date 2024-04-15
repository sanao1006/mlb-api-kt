package app.sanao1006.mlbapi.model.homeRunDerby


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Matchup(
    @SerialName("bottomSeed")
    val bottomSeed: BottomSeed,
    @SerialName("topSeed")
    val topSeed: TopSeed
)