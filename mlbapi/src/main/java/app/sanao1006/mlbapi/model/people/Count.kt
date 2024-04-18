package app.sanao1006.mlbapi.model.people


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Count(
    @SerialName("balls")
    val balls: Int,
    @SerialName("inning")
    val inning: Int,
    @SerialName("outs")
    val outs: Int,
    @SerialName("strikes")
    val strikes: Int
)