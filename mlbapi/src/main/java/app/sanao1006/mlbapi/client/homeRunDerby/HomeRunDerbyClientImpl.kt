package app.sanao1006.mlbapi.client.homeRunDerby

import app.sanao1006.mlbapi.model.homeRunDerby.HomeRunDerby
import com.skydoves.sandwich.getOrThrow

class HomeRunDerbyClientImpl(
    private val homeRunDerbyClient: HomeRunDerbyClient
) {
    suspend fun getHomeRunDerby(gamePk: Int): HomeRunDerby =
        homeRunDerbyClient.getHomeRunDerby(gamePk).getOrThrow()
}
