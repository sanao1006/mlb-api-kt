package app.sanao1006.mlbapi.model.draft


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Draft(
    @SerialName("copyright")
    val copyright: String,
    @SerialName("drafts")
    val drafts: Drafts
)