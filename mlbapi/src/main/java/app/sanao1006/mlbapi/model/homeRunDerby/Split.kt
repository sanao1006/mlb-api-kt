package app.sanao1006.mlbapi.model.homeRunDerby


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Split(
    @SerialName("gameType")
    val gameType: String,
    @SerialName("league")
    val league: League? = null,
    @SerialName("numOccurrences")
    val numOccurrences: Int? = null,
    @SerialName("player")
    val player: Player,
    @SerialName("season")
    val season: String,
    @SerialName("sport")
    val sport: SportX? = null,
    @SerialName("stat")
    val stat: StatX,
    @SerialName("team")
    val team: Team? = null
)