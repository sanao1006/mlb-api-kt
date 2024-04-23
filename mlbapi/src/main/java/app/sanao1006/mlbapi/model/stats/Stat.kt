package app.sanao1006.mlbapi.model.stats


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Stat(
    @SerialName("exemptions")
    val exemptions: List<String>,
    @SerialName("group")
    val group: Group,
    @SerialName("playerPool")
    val playerPool: String,
    @SerialName("splits")
    val splits: List<Split>,
    @SerialName("splitsTiedWithLimit")
    val splitsTiedWithLimit: List<String>,
    @SerialName("splitsTiedWithOffset")
    val splitsTiedWithOffset: List<String>,
    @SerialName("totalSplits")
    val totalSplits: Int,
    @SerialName("type")
    val type: Type
)