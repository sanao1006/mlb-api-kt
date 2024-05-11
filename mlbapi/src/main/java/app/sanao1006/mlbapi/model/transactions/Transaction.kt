package app.sanao1006.mlbapi.model.transactions


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Transaction(
    @SerialName("date")
    val date: String,
    @SerialName("description")
    var description: String? = "",
    @SerialName("effectiveDate")
    var effectiveDate: String? = "",
    @SerialName("fromTeam")
    val fromTeam: FromTeam? = null,
    @SerialName("id")
    val id: Int,
    @SerialName("person")
    val person: Person? = null,
    @SerialName("resolutionDate")
    var resolutionDate: String? = "",
    @SerialName("toTeam")
    val toTeam: ToTeam,
    @SerialName("typeCode")
    val typeCode: String,
    @SerialName("typeDesc")
    val typeDesc: String
)