package app.sanao1006.mlbapi.client.people

import app.sanao1006.mlbapi.model.people.People
import app.sanao1006.mlbapi.model.people.PeopleResponse
import com.skydoves.sandwich.ApiResponse
import java.net.ConnectException

class PeopleClientImpl(
    private val peopleClient: PeopleClient
) {
    suspend fun getPeople(personIds: Int): List<People> =
        peopleClient.getPeople(personIds = personIds).toList()

    companion object {
        fun ApiResponse<PeopleResponse>.toList(): List<People> {
            return when (this) {
                is ApiResponse.Success -> this.data.people
                is ApiResponse.Failure -> throw ConnectException("connection error")
            }
        }
    }

}
