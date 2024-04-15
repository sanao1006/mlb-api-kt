package app.sanao1006.mlbapi.model.highlow


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Split(
    @SerialName("awayTeam")
    val awayTeam: AwayTeam? = null,
    @SerialName("date")
    val date: String,
    @SerialName("game")
    val game: Game,
    @SerialName("gameInnings")
    val gameInnings: Int,
    @SerialName("homeTeam")
    val homeTeam: HomeTeam? = null,
    @SerialName("isHome")
    val isHome: Boolean,
    @SerialName("opponent")
    val opponent: Opponent? = null,
    @SerialName("rank")
    val rank: Int,
    @SerialName("season")
    val season: String,
    @SerialName("stat")
    val stat: Stat,
    @SerialName("team")
    val team: Team? = null
)
