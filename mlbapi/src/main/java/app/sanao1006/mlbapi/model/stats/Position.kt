package app.sanao1006.mlbapi.model.stats


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Position(
    @SerialName("abbreviation")
    val abbreviation: String,
    @SerialName("code")
    val code: String,
    @SerialName("name")
    val name: String,
    @SerialName("type")
    val type: String
)