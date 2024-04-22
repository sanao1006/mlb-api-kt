package app.sanao1006.mlbapi.model.standings


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TeamRecord(
    @SerialName("clinched")
    val clinched: Boolean,
    @SerialName("conferenceGamesBack")
    val conferenceGamesBack: String,
    @SerialName("divisionChamp")
    val divisionChamp: Boolean,
    @SerialName("divisionGamesBack")
    val divisionGamesBack: String,
    @SerialName("divisionLeader")
    val divisionLeader: Boolean,
    @SerialName("divisionRank")
    val divisionRank: String,
    @SerialName("eliminationNumber")
    val eliminationNumber: String,
    @SerialName("eliminationNumberConference")
    val eliminationNumberConference: String,
    @SerialName("eliminationNumberDivision")
    val eliminationNumberDivision: String,
    @SerialName("eliminationNumberLeague")
    val eliminationNumberLeague: String,
    @SerialName("eliminationNumberSport")
    val eliminationNumberSport: String,
    @SerialName("gamesBack")
    val gamesBack: String,
    @SerialName("gamesPlayed")
    val gamesPlayed: Int,
    @SerialName("hasWildcard")
    val hasWildcard: Boolean,
    @SerialName("lastUpdated")
    val lastUpdated: String,
    @SerialName("leagueGamesBack")
    val leagueGamesBack: String,
    @SerialName("leagueRank")
    val leagueRank: String,
    @SerialName("leagueRecord")
    val leagueRecord: LeagueRecord,
    @SerialName("losses")
    val losses: Int,
    @SerialName("magicNumber")
    val magicNumber: String? = null,
    @SerialName("records")
    val records: Records,
    @SerialName("runDifferential")
    val runDifferential: Int,
    @SerialName("runsAllowed")
    val runsAllowed: Int,
    @SerialName("runsScored")
    val runsScored: Int,
    @SerialName("season")
    val season: String,
    @SerialName("sportGamesBack")
    val sportGamesBack: String,
    @SerialName("sportRank")
    val sportRank: String,
    @SerialName("springLeagueGamesBack")
    val springLeagueGamesBack: String,
    @SerialName("streak")
    val streak: Streak,
    @SerialName("team")
    val team: Team,
    @SerialName("wildCardEliminationNumber")
    val wildCardEliminationNumber: String,
    @SerialName("wildCardGamesBack")
    val wildCardGamesBack: String,
    @SerialName("wildCardLeader")
    val wildCardLeader: Boolean? = null,
    @SerialName("wildCardRank")
    val wildCardRank: String? = null,
    @SerialName("winningPercentage")
    val winningPercentage: String,
    @SerialName("wins")
    val wins: Int
)