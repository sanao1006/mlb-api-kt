package app.sanao1006.mlbapi.client.transactions

import app.sanao1006.mlbapi.model.transactions.Transaction
import app.sanao1006.mlbapi.model.transactions.TransactionsResponse
import com.skydoves.sandwich.ApiResponse

class TransactionsClientImpl(
    private val transactionsClient: TransactionsClient
) {
    suspend fun getTransactions(
        teamId: Int,
        playerId: Int? = null,
        date: String? = null,
        startDate: String? = null,
        endDate: String? = null,
    ): List<Transaction> =
        transactionsClient.getTransactions(
            teamId = teamId,
            playerId = playerId,
            date = date,
            startDate = startDate,
            endDate = endDate
        ).toList()

    private fun ApiResponse<TransactionsResponse>.toList(): List<Transaction> {
        return when (this) {
            is ApiResponse.Success -> this.data.transactions
            is ApiResponse.Failure -> emptyList()
        }
    }
}