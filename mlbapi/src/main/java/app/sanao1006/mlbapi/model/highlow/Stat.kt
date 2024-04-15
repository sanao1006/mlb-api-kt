package app.sanao1006.mlbapi.model.highlow


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Stat(
    @SerialName("hits")
    val hits: Int
)
