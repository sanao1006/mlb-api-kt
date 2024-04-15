package app.sanao1006.mlbapi.model.highlow


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HighLowResult(
    @SerialName("combinedStats")
    val combinedStats: Boolean,
    @SerialName("exemptions")
    val exemptions: List<String> = emptyList(),
    @SerialName("gameType")
    val gameType: GameType,
    @SerialName("group")
    val group: Group,
    @SerialName("season")
    val season: String,
    @SerialName("sortStat")
    val sortStat: SortStat,
    @SerialName("splits")
    val splits: List<Split>,
    @SerialName("splitsTiedWithLimit")
    val splitsTiedWithLimit: List<SplitsTiedWithLimit>,
    @SerialName("splitsTiedWithOffset")
    val splitsTiedWithOffset: List<String> = emptyList(),
    @SerialName("totalSplits")
    val totalSplits: Int
)
