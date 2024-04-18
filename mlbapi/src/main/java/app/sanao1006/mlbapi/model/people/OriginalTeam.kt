package app.sanao1006.mlbapi.model.people


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class OriginalTeam(
    @SerialName("id")
    val id: Int? = null,
    @SerialName("link")
    val link: String,
    @SerialName("name")
    val name: String? = null
)