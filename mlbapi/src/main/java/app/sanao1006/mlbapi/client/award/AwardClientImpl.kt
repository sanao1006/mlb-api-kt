package app.sanao1006.mlbapi.client.award

import app.sanao1006.mlbapi.model.award.Award
import app.sanao1006.mlbapi.model.award.Awards
import com.skydoves.sandwich.ApiResponse
import java.net.ConnectException

class AwardClientImpl(
    private val awardClient: AwardClient
) {
    suspend fun getAwards(): List<Award> = awardClient.getAwards().toList()

    companion object {
        fun ApiResponse<Awards>.toList(): List<Award> {
            return when(this) {
                is ApiResponse.Success ->this.data.awards
                is ApiResponse.Failure -> throw ConnectException("connection error")
            }
        }
    }
}
