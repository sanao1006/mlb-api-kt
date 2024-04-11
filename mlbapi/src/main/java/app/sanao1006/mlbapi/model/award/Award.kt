package app.sanao1006.mlbapi.model.award

import app.sanao1006.mlbkt.models.awards.League
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Award(
    @SerialName("description")
    val description: String? = null,
    @SerialName("id")
    val id: String,
    @SerialName("league")
    val league: League? = null,
    @SerialName("name")
    val name: String,
    @SerialName("notes")
    val notes: String? = null,
    @SerialName("sortOrder")
    val sortOrder: Int,
    @SerialName("sport")
    val sport: Sport? = null
)
