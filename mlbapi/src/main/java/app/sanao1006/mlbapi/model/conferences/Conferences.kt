package app.sanao1006.mlbapi.model.conferences


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Conferences(
    @SerialName("conferences")
    val conferences: List<Conference>,
    @SerialName("copyright")
    val copyright: String
)
