package app.sanao1006.mlbapi.model.teams


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TeamCoachesResponse(
    @SerialName("copyright")
    val copyright: String,
    @SerialName("link")
    val link: String,
    @SerialName("roster")
    val roster: List<Roster>,
    @SerialName("rosterType")
    val rosterType: String,
    @SerialName("teamId")
    val teamId: Int
)

data class Coaches(
    val link: String,
    val roster: List<Roster>,
    val rosterType: String,
    val teamId: Int
)
