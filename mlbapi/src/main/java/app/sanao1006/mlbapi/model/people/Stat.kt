package app.sanao1006.mlbapi.model.people


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Stat(
    @SerialName("exemptions")
    val exemptions: List<String> = emptyList(),
    @SerialName("group")
    val group: Group? = null,
    @SerialName("splits")
    val splits: List<Split>,
    @SerialName("totalSplits")
    val totalSplits: Int? = null,
    @SerialName("type")
    val type: TypeX? = null
)