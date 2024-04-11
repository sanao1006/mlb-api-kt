package app.sanao1006.mlbapi.model.award


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class League(
    @SerialName("id")
    val id: Int,
    @SerialName("link")
    val link: String
)
