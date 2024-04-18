package app.sanao1006.mlbapi.client.people

import app.sanao1006.mlbapi.model.people.People
import app.sanao1006.mlbapi.model.people.PeopleFreeAgents
import app.sanao1006.mlbapi.model.people.PeopleFreeAgentsResponse
import app.sanao1006.mlbapi.model.people.PeopleResponse
import com.skydoves.sandwich.ApiResponse
import com.skydoves.sandwich.getOrThrow
import java.net.ConnectException

class PeopleClientImpl(
    private val peopleClient: PeopleClient
) {
    suspend fun getPeople(personIds: Int): List<People> =
        peopleClient.getPeople(personIds = personIds).toList()

    suspend fun getPeopleFreeAgents(leagueId: Int, season: Int): PeopleFreeAgents =
        peopleClient.getPeopleFreeAgents(leagueId = leagueId, season = season).toPeopleFreeAgents()

    companion object {
        fun ApiResponse<PeopleResponse>.toList(): List<People> {
            return when (this) {
                is ApiResponse.Success -> this.data.people
                is ApiResponse.Failure -> throw ConnectException("connection error")
            }
        }

        @JvmName("peopleFreeAgentsResponseToPeopleFreeAgents")
        fun ApiResponse<PeopleFreeAgentsResponse>.toPeopleFreeAgents(): PeopleFreeAgents {
            return when (this) {
                is ApiResponse.Success -> this.data.toPeopleFreeAgents()
                is ApiResponse.Failure -> throw ConnectException("connection error")
            }
        }
    }

}
