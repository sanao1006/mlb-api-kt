package app.sanao1006.mlbapi.model.homeRunDerby


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Player(
    @SerialName("active")
    val active: Boolean? = null,
    @SerialName("batSide")
    val batSide: BatSide? = null,
    @SerialName("birthCity")
    val birthCity: String? = null,
    @SerialName("birthCountry")
    val birthCountry: String? = null,
    @SerialName("birthDate")
    val birthDate: String? = null,
    @SerialName("birthStateProvince")
    val birthStateProvince: String? = null,
    @SerialName("boxscoreName")
    val boxscoreName: String? = null,
    @SerialName("currentAge")
    val currentAge: Int? = null,
    @SerialName("currentTeam")
    val currentTeam: CurrentTeam? = null,
    @SerialName("draftYear")
    val draftYear: Int? = null,
    @SerialName("firstLastName")
    val firstLastName: String? = null,
    @SerialName("firstName")
    val firstName: String? = null,
    @SerialName("fullFMLName")
    val fullFMLName: String? = null,
    @SerialName("fullLFMName")
    val fullLFMName: String? = null,
    @SerialName("fullName")
    val fullName: String,
    @SerialName("gender")
    val gender: String? = null,
    @SerialName("height")
    val height: String? = null,
    @SerialName("id")
    val id: Int,
    @SerialName("initLastName")
    val initLastName: String? = null,
    @SerialName("isPlayer")
    val isPlayer: Boolean? = null,
    @SerialName("isVerified")
    val isVerified: Boolean? = null,
    @SerialName("lastFirstName")
    val lastFirstName: String? = null,
    @SerialName("lastInitName")
    val lastInitName: String? = null,
    @SerialName("lastName")
    val lastName: String? = null,
    @SerialName("lastPlayedDate")
    val lastPlayedDate: String? = null,
    @SerialName("link")
    val link: String,
    @SerialName("middleName")
    val middleName: String? = null,
    @SerialName("mlbDebutDate")
    val mlbDebutDate: String? = null,
    @SerialName("nameFirstLast")
    val nameFirstLast: String? = null,
    @SerialName("nameMatrilineal")
    val nameMatrilineal: String? = null,
    @SerialName("nameSlug")
    val nameSlug: String? = null,
    @SerialName("nickName")
    val nickName: String? = null,
    @SerialName("pitchHand")
    val pitchHand: PitchHand? = null,
    @SerialName("primaryNumber")
    val primaryNumber: String? = null,
    @SerialName("primaryPosition")
    val primaryPosition: PrimaryPosition? = null,
    @SerialName("pronunciation")
    val pronunciation: String? = null,
    @SerialName("stats")
    val stats: List<Stat>? = null,
    @SerialName("strikeZoneBottom")
    val strikeZoneBottom: Double? = null,
    @SerialName("strikeZoneTop")
    val strikeZoneTop: Double? = null,
    @SerialName("useLastName")
    val useLastName: String? = null,
    @SerialName("useName")
    val useName: String? = null,
    @SerialName("weight")
    val weight: Int? = null
)