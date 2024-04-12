package app.sanao1006.mlbapi.model.draft


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class School(
    @SerialName("city")
    val city: String,
    @SerialName("country")
    val country: String,
    @SerialName("name")
    val name: String,
    @SerialName("schoolClass")
    val schoolClass: String,
    @SerialName("state")
    val state: String?
)