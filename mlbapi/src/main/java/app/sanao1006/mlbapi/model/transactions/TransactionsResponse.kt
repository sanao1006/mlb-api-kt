package app.sanao1006.mlbapi.model.transactions


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TransactionsResponse(
    @SerialName("copyright")
    val copyright: String,
    @SerialName("transactions")
    val transactions: List<Transaction>
)