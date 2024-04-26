package app.sanao1006.mlbapi.model.stats


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Split(
    @SerialName("league")
    val league: League,
    @SerialName("numTeams")
    val numTeams: Int,
    @SerialName("player")
    val player: Player,
    @SerialName("position")
    val position: Position,
    @SerialName("rank")
    val rank: Int,
    @SerialName("season")
    val season: String,
    @SerialName("sport")
    val sport: Sport,
    @SerialName("stat")
    @Serializable(with = HittingOrPitchingStatSerializer::class)
    val stat: HittingOrPitchingStat,
    @SerialName("team")
    val team: Team
)