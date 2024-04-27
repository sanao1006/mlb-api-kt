package app.sanao1006.mlbapi.model.teams


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SpringLeague(
    @SerialName("abbreviation")
    val abbreviation: String,
    @SerialName("id")
    val id: Int,
    @SerialName("link")
    val link: String,
    @SerialName("name")
    val name: String
)