package app.sanao1006.mlbapi.model.homeRunDerby


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SportX(
    @SerialName("abbreviation")
    val abbreviation: String,
    @SerialName("id")
    val id: Int,
    @SerialName("link")
    val link: String
)