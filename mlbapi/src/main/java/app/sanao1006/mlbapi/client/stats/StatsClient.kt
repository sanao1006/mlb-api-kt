package app.sanao1006.mlbapi.client.stats

import app.sanao1006.mlbapi.model.stats.StatsLeadersResponse
import app.sanao1006.mlbapi.model.stats.StatsResponse
import com.skydoves.sandwich.ApiResponse
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.Query

interface StatsClient {
    @GET("stats")
    suspend fun getStats(
        @Query("stats") stats: String,
        @Query("group") group: String,
        @Query("season") season: String
    ): ApiResponse<StatsResponse>

    @GET("stats/leaders")
    suspend fun getStatsLeaders(
        @Query("leaderCategories") leaderCategories: String
    ): ApiResponse<StatsLeadersResponse>
}