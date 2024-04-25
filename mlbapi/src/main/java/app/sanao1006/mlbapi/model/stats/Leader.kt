package app.sanao1006.mlbapi.model.stats


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Leader(
    @SerialName("league")
    val league: League,
    @SerialName("numTeams")
    val numTeams: Int,
    @SerialName("person")
    val person: Person,
    @SerialName("rank")
    val rank: Int,
    @SerialName("season")
    val season: String,
    @SerialName("sport")
    val sport: Sport,
    @SerialName("team")
    val team: Team,
    @SerialName("value")
    val value: String
)