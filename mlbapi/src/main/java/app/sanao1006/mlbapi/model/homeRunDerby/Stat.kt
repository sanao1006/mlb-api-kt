package app.sanao1006.mlbapi.model.homeRunDerby


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Stat(
    @SerialName("exemptions")
    val exemptions: List<String> = emptyList(),
    @SerialName("group")
    val group: Group,
    @SerialName("splits")
    val splits: List<Split>,
    @SerialName("type")
    val type: Type
)