package app.sanao1006.mlbapi.model.draft


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Team(
    @SerialName("allStarStatus")
    val allStarStatus: String,
    @SerialName("id")
    val id: Int,
    @SerialName("link")
    val link: String,
    @SerialName("name")
    val name: String,
    @SerialName("springLeague")
    val springLeague: SpringLeague
)