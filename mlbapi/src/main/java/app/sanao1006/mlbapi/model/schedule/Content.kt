package app.sanao1006.mlbapi.model.schedule


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Content(
    @SerialName("link")
    val link: String
)