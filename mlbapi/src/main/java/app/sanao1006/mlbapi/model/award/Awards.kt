package app.sanao1006.mlbapi.model.award


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Awards(
    @SerialName("awards")
    val awards: List<Award>,
//    @SerialName("copyright")
    val copyright: String
)
