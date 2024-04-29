package app.sanao1006.mlbapi.model.teams


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Person(
    @SerialName("fullName")
    val fullName: String,
    @SerialName("id")
    val id: Int,
    @SerialName("link")
    val link: String
)