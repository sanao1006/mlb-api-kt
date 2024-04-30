package app.sanao1006.mlbapi.model.sports


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Sport(
    @SerialName("abbreviation")
    val abbreviation: String,
    @SerialName("activeStatus")
    val activeStatus: Boolean,
    @SerialName("code")
    val code: String,
    @SerialName("id")
    val id: Int,
    @SerialName("link")
    val link: String,
    @SerialName("name")
    val name: String,
    @SerialName("sortOrder")
    val sortOrder: Int
)