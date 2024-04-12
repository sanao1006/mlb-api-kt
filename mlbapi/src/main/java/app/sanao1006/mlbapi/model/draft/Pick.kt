package app.sanao1006.mlbapi.model.draft


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Pick(
    @SerialName("bisPlayerId")
    val bisPlayerId: Int,
    @SerialName("blurb")
    val blurb: String? = null,
    @SerialName("displayPickNumber")
    val displayPickNumber: Int,
    @SerialName("draftType")
    val draftType: DraftType,
    @SerialName("headshotLink")
    val headshotLink: String,
    @SerialName("home")
    val home: Home,
    @SerialName("isDrafted")
    val isDrafted: Boolean,
    @SerialName("isPass")
    val isPass: Boolean,
    @SerialName("person")
    val person: Person,
    @SerialName("pickNumber")
    val pickNumber: Int,
    @SerialName("pickRound")
    val pickRound: String,
    @SerialName("pickValue")
    val pickValue: String? = null,
    @SerialName("rank")
    val rank: Int?,
    @SerialName("roundPickNumber")
    val roundPickNumber: Int,
    @SerialName("school")
    val school: School,
    @SerialName("scoutingReport")
    val scoutingReport: String? = null,
    @SerialName("signingBonus")
    val signingBonus: String? = null,
    @SerialName("team")
    val team: Team,
    @SerialName("year")
    val year: String
)