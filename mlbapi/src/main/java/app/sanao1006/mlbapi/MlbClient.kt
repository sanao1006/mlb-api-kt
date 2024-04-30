package app.sanao1006.mlbapi

import app.sanao1006.mlbapi.client.attendance.AttendanceClientImpl
import app.sanao1006.mlbapi.client.award.AwardClientImpl
import app.sanao1006.mlbapi.client.conferences.ConferencesClientImpl
import app.sanao1006.mlbapi.client.divisions.DivisionsClientImpl
import app.sanao1006.mlbapi.client.draft.DraftClientImpl
import app.sanao1006.mlbapi.client.highlow.HighLowClientImpl
import app.sanao1006.mlbapi.client.homeRunDerby.HomeRunDerbyClientImpl
import app.sanao1006.mlbapi.client.league.LeagueClientImpl
import app.sanao1006.mlbapi.client.people.PeopleClientImpl
import app.sanao1006.mlbapi.client.sports.SportsClientImpl
import app.sanao1006.mlbapi.client.standings.StandingsClientImpl
import app.sanao1006.mlbapi.client.stats.StatsClientImpl
import app.sanao1006.mlbapi.client.teams.TeamsClientImpl
import app.sanao1006.mlbapi.model.stats.HittingOrPitchingStat
import app.sanao1006.mlbapi.model.stats.HittingStat
import app.sanao1006.mlbapi.model.stats.PitchingStat
import com.skydoves.sandwich.ktorfit.ApiResponseConverterFactory
import de.jensklingenberg.ktorfit.Ktorfit
import io.ktor.client.HttpClient
import io.ktor.client.engine.android.Android
import io.ktor.client.plugins.DefaultRequest
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.header
import io.ktor.http.ContentType
import io.ktor.http.HttpHeaders
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic

class MlbClient {
    companion object {
        private const val BASE_URL = "https://statsapi.mlb.com/api/"
        private const val V1 = "v1/"
        private const val V2 = "v2/"
        private val ktorClient = HttpClient(Android) {
            engine {
                connectTimeout = 5000
                socketTimeout = 5000
            }
            install(ContentNegotiation) {
                json(Json {
                    isLenient = true
                    prettyPrint = true
                    ignoreUnknownKeys = true
                    useArrayPolymorphism = false
                    encodeDefaults = true
                    serializersModule = SerializersModule {
                        polymorphic(HittingOrPitchingStat::class) {
                            subclass(HittingStat::class, HittingStat.serializer())
                            subclass(PitchingStat::class, PitchingStat.serializer())
                        }
                    }
                })
            }

            install(DefaultRequest) {
                header(HttpHeaders.ContentType, ContentType.Application.Json)
            }

        }
        private val api = Ktorfit.Builder().httpClient(ktorClient).converterFactories(
            ApiResponseConverterFactory.create())
    }

    val awardsClient by lazy { AwardClientImpl(api.baseUrl(BASE_URL + V1).build().create()) }
    val conferencesClient by lazy { ConferencesClientImpl(api.baseUrl(BASE_URL + V1).build().create()) }
    val attendanceClient by lazy { AttendanceClientImpl(api.baseUrl(BASE_URL + V1).build().create()) }
    val divisionsClient by lazy { DivisionsClientImpl(api.baseUrl(BASE_URL + V1).build().create()) }
    val draftClient by lazy { DraftClientImpl(api.baseUrl(BASE_URL + V1).build().create()) }
    val highLowClient by lazy { HighLowClientImpl(api.baseUrl(BASE_URL + V1).build().create()) }
    val homeRunDerbyClient by lazy { HomeRunDerbyClientImpl(api.baseUrl(BASE_URL + V1).build().create()) }
    val leagueClient by lazy { LeagueClientImpl(api.baseUrl(BASE_URL + V1).build().create()) }
    val peopleClient by lazy { PeopleClientImpl(api.baseUrl(BASE_URL + V1).build().create()) }
    val standingsClient by lazy { StandingsClientImpl(api.baseUrl(BASE_URL + V1).build().create()) }
    val statsClient by lazy { StatsClientImpl(api.baseUrl(BASE_URL + V1).build().create()) }
    val teamsClient by lazy { TeamsClientImpl(api.baseUrl(BASE_URL + V1).build().create()) }
    val sportsClient by lazy { SportsClientImpl(api.baseUrl(BASE_URL + V1).build().create()) }
}
