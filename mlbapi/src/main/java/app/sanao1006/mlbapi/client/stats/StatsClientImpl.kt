package app.sanao1006.mlbapi.client.stats

import app.sanao1006.mlbapi.model.stats.Stat
import app.sanao1006.mlbapi.model.stats.StatsResponse
import com.skydoves.sandwich.ApiResponse
import java.net.ConnectException
import java.time.LocalDateTime

class StatsClientImpl(
    private val statsClient: StatsClient
) {
    suspend fun getStats(
        stats: String,
        group: String,
        season: String = LocalDateTime.now().year.toString()
    ): List<Stat> {
        return statsClient.getStats(
            stats = stats,
            group = group,
            season = season
        ).toList()
    }

    companion object {
        fun ApiResponse<StatsResponse>.toList(): List<Stat> {
            return when (this) {
                is ApiResponse.Success -> this.data.stats
                is ApiResponse.Failure -> throw ConnectException("connection error")
            }
        }
    }
}