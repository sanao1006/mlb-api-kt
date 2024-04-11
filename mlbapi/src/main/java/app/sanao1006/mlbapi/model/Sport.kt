package app.sanao1006.mlbapi.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Sport(
    @SerialName("id")
    val id: Int,
    @SerialName("link")
    val link: String
)
