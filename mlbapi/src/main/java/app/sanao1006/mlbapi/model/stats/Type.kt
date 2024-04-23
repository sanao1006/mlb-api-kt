package app.sanao1006.mlbapi.model.stats


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Type(
    @SerialName("displayName")
    val displayName: String
)