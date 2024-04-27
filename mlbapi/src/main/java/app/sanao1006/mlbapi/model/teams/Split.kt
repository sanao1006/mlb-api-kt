package app.sanao1006.mlbapi.model.teams


import app.sanao1006.mlbapi.model.stats.HittingOrPitchingStat
import app.sanao1006.mlbapi.model.stats.HittingOrPitchingStatSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.Serializer

@Serializable
data class Split(
    @SerialName("rank")
    val rank: Int,
    @SerialName("season")
    val season: String,
    @SerialName("stat")
    @Serializable(with = HittingOrPitchingStatSerializer::class)
    val stat: HittingOrPitchingStat,
    @SerialName("team")
    val team: TeamStat
)