package app.sanao1006.mlbapi.model.draft


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Home(
    @SerialName("city")
    val city: String,
    @SerialName("country")
    val country: String,
    @SerialName("state")
    val state: String? = null
)