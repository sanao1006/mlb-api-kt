package app.sanao1006.mlbapi.model.highlow


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SortStat(
    @SerialName("highLowTypes")
    val highLowTypes: List<String>,
    @SerialName("isCounting")
    val isCounting: Boolean,
    @SerialName("label")
    val label: String,
    @SerialName("lookupParam")
    val lookupParam: String,
    @SerialName("name")
    val name: String,
    @SerialName("orgTypes")
    val orgTypes: List<String>,
    @SerialName("statGroups")
    val statGroups: List<StatGroup>,
    @SerialName("streakLevels")
    val streakLevels: List<String> = emptyList()
)
