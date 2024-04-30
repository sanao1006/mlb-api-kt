package app.sanao1006.mlbapi.client.sports

import app.sanao1006.mlbapi.model.sports.Sport
import app.sanao1006.mlbapi.model.sports.SportsResponse
import com.skydoves.sandwich.ApiResponse

class SportsClientImpl(
    private val sportsClient: SportsClient
) {
    suspend fun getSports(
        sportId: Int? = null,
        fields: String? = null
    ): List<Sport> =
        sportsClient.getSports(sportId = sportId, fields = fields).toList()

    companion object {
        fun ApiResponse<SportsResponse>.toList(): List<Sport> {
            return when (this) {
                is ApiResponse.Success -> this.data.sports
                is ApiResponse.Failure -> emptyList()
            }
        }
    }
}
