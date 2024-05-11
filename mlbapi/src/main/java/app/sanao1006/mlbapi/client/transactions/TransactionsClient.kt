package app.sanao1006.mlbapi.client.transactions

import app.sanao1006.mlbapi.model.transactions.TransactionsResponse
import com.skydoves.sandwich.ApiResponse
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.Query

interface TransactionsClient {
    @GET("transactions")
    suspend fun getTransactions(
        @Query("teamId") teamId: Int,
        @Query("playerId") playerId: Int?,
        @Query("date") date: String?,
        @Query("startDate") startDate: String?,
        @Query("endDate") endDate: String?
    ): ApiResponse<TransactionsResponse>
}
