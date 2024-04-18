package app.sanao1006.mlbapi.model.people


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Play(
    @SerialName("count")
    val count: Count,
    @SerialName("details")
    val details: Details,
    @SerialName("endTime")
    val endTime: String,
    @SerialName("hitData")
    val hitData: HitData? = null,
    @SerialName("index")
    val index: Int,
    @SerialName("isPitch")
    val isPitch: Boolean,
    @SerialName("pitchData")
    val pitchData: PitchData,
    @SerialName("pitchNumber")
    val pitchNumber: Int,
    @SerialName("playId")
    val playId: String,
    @SerialName("startTime")
    val startTime: String,
    @SerialName("type")
    val type: String
)