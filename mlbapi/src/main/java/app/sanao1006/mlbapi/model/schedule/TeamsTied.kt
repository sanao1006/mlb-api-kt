package app.sanao1006.mlbapi.model.schedule


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TeamsTied(
    @SerialName("away")
    val away: AwayTied,
    @SerialName("home")
    val home: HomeTied
)