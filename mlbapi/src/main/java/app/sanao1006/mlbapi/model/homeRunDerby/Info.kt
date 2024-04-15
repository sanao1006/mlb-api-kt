package app.sanao1006.mlbapi.model.homeRunDerby


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Info(
    @SerialName("eventDate")
    val eventDate: String,
    @SerialName("eventNumber")
    val eventNumber: Int,
    @SerialName("eventType")
    val eventType: EventType,
    @SerialName("fileCode")
    val fileCode: String,
    @SerialName("id")
    val id: Int,
    @SerialName("isMultiDay")
    val isMultiDay: Boolean,
    @SerialName("isPrimaryCalendar")
    val isPrimaryCalendar: Boolean,
    @SerialName("name")
    val name: String,
    @SerialName("nonGameGuid")
    val nonGameGuid: String,
    @SerialName("publicFacing")
    val publicFacing: Boolean,
    @SerialName("teams")
    val teams: List<Team>,
    @SerialName("venue")
    val venue: Venue
)