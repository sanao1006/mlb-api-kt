package app.sanao1006.mlbapi.model.teams


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Leader(
    @SerialName("league")
    val league: League,
    @SerialName("person")
    val person: Player,
    @SerialName("rank")
    val rank: Int,
    @SerialName("season")
    val season: String,
    @SerialName("sport")
    val sport: SportX,
    @SerialName("team")
    val team: BelongingTeam,
    @SerialName("value")
    val value: String
)