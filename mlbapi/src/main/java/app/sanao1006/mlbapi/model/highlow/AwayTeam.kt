package app.sanao1006.mlbapi.model.highlow


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AwayTeam(
    @SerialName("id")
    val id: Int,
    @SerialName("link")
    val link: String,
    @SerialName("name")
    val name: String
)
