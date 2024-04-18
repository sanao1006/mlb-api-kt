package app.sanao1006.mlbapi.model.people


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Batter(
    @SerialName("firstName")
    val firstName: String,
    @SerialName("fullName")
    val fullName: String,
    @SerialName("id")
    val id: Int,
    @SerialName("lastName")
    val lastName: String,
    @SerialName("link")
    val link: String
)