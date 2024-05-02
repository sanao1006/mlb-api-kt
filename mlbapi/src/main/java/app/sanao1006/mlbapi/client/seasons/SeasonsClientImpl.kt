package app.sanao1006.mlbapi.client.seasons

import app.sanao1006.mlbapi.model.seasons.Season
import app.sanao1006.mlbapi.model.seasons.SeasonAll
import app.sanao1006.mlbapi.model.seasons.SeasonsAllResponse
import app.sanao1006.mlbapi.model.seasons.SeasonsResponse
import com.skydoves.sandwich.ApiResponse

class SeasonsClientImpl(
    private val seasonsClient: SeasonsClient
) {
    suspend fun getSeasons(
        sportId: Int,
        season: Int? = null,
        divisionId: Int? = null,
        leagueId: Int? = null,
        fields: String? = null
    ): List<Season> =
        seasonsClient.getSeasons(
            sportId = sportId,
            season = season,
            divisionId = divisionId,
            leagueId = leagueId,
            fields = fields
        ).toList()

    suspend fun getSeasonsAll(
        sportId: Int,
        season: Int? = null,
        divisionId: Int? = null,
        leagueId: Int? = null,
        fields: String? = null
    ): List<SeasonAll> =
        seasonsClient.getSeasonsAll(
            sportId = sportId,
            season = season,
            divisionId = divisionId,
            leagueId = leagueId,
            fields = fields
        ).toList()

    companion object {
        fun ApiResponse<SeasonsResponse>.toList(): List<Season> {
            return when (this) {
                is ApiResponse.Success -> this.data.seasons
                is ApiResponse.Failure -> emptyList()
            }
        }
        @JvmName("SeasonsAllResponseToSeasonAllList")
        fun ApiResponse<SeasonsAllResponse>.toList(): List<SeasonAll> {
            return when (this) {
                is ApiResponse.Success -> this.data.seasons
                is ApiResponse.Failure -> emptyList()
            }
        }
    }
}