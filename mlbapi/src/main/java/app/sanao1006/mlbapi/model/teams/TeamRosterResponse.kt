package app.sanao1006.mlbapi.model.teams


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TeamRosterResponse(
    @SerialName("copyright")
    val copyright: String,
    @SerialName("link")
    val link: String,
    @SerialName("roster")
    val roster: List<RosterX>,
    @SerialName("rosterType")
    val rosterType: String,
    @SerialName("teamId")
    val teamId: Int
)
data class TeamRoster(
    val link: String,
    val roster: List<RosterX>,
    val rosterType: String,
    val teamId: Int
)
