package app.sanao1006.mlbapi.model.people


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Split(
    @SerialName("batter")
    val batter: Batter? = null,
    @SerialName("gameType")
    val gameType: String? = null,
    @SerialName("group")
    val group: String? = null,
    @SerialName("numTeams")
    val numTeams: Int? = null,
    @SerialName("opponent")
    val opponent: Opponent? = null,
    @SerialName("pitcher")
    val pitcher: Pitcher? = null,
    @SerialName("stat")
    val stat: StatX? = null,
    @SerialName("team")
    val team: Team? = null,
    @SerialName("type")
    val type: String? = null
)