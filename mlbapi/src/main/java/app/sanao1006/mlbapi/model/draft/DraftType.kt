package app.sanao1006.mlbapi.model.draft


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DraftType(
    @SerialName("code")
    val code: String,
    @SerialName("description")
    val description: String
)