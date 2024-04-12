package app.sanao1006.mlbapi.model.draft


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Person(
    @SerialName("active")
    val active: Boolean,
    @SerialName("batSide")
    val batSide: BatSide,
    @SerialName("birthCity")
    val birthCity: String,
    @SerialName("birthCountry")
    val birthCountry: String,
    @SerialName("birthDate")
    val birthDate: String,
    @SerialName("birthStateProvince")
    val birthStateProvince: String?,
    @SerialName("boxscoreName")
    val boxscoreName: String,
    @SerialName("currentAge")
    val currentAge: Int,
    @SerialName("draftYear")
    val draftYear: Int,
    @SerialName("firstLastName")
    val firstLastName: String,
    @SerialName("firstName")
    val firstName: String,
    @SerialName("fullFMLName")
    val fullFMLName: String,
    @SerialName("fullLFMName")
    val fullLFMName: String,
    @SerialName("fullName")
    val fullName: String,
    @SerialName("gender")
    val gender: String?,
    @SerialName("height")
    val height: String,
    @SerialName("id")
    val id: Int,
    @SerialName("initLastName")
    val initLastName: String,
    @SerialName("isPlayer")
    val isPlayer: Boolean,
    @SerialName("isVerified")
    val isVerified: Boolean,
    @SerialName("lastFirstName")
    val lastFirstName: String,
    @SerialName("lastInitName")
    val lastInitName: String,
    @SerialName("lastName")
    val lastName: String,
    @SerialName("link")
    val link: String,
    @SerialName("middleName")
    val middleName: String?,
    @SerialName("mlbDebutDate")
    val mlbDebutDate: String?,
    @SerialName("nameFirstLast")
    val nameFirstLast: String,
    @SerialName("nameMatrilineal")
    val nameMatrilineal: String?,
    @SerialName("nameSlug")
    val nameSlug: String,
    @SerialName("nameSuffix")
    val nameSuffix: String?,
    @SerialName("nameTitle")
    val nameTitle: String?,
    @SerialName("nickName")
    val nickName: String?,
    @SerialName("pitchHand")
    val pitchHand: PitchHand,
    @SerialName("primaryNumber")
    val primaryNumber: String?,
    @SerialName("primaryPosition")
    val primaryPosition: PrimaryPosition,
    @SerialName("strikeZoneBottom")
    val strikeZoneBottom: Double,
    @SerialName("strikeZoneTop")
    val strikeZoneTop: Double,
    @SerialName("useLastName")
    val useLastName: String,
    @SerialName("useName")
    val useName: String,
    @SerialName("weight")
    val weight: Int
)