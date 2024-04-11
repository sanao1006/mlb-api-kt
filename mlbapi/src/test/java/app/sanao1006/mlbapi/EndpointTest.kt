package app.sanao1006.mlbapi

import kotlinx.coroutines.test.runTest
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull

class EndpointTest {
    private val client = MlbClient()

    @Test
    fun `Communication test of the attendance endpoint`() = runTest {
        val attendance = client.attendanceClient.getAttendance(teamId = 111, leagueId = 103, leagueListId = "mlb")
        assertNotNull(attendance.records)
        assertNotNull(attendance.aggregateTotals)
        println(attendance.records[0].openingsTotal)
        assertEquals(120, attendance.records[0].openingsTotal)
        assertEquals(71771, attendance.records[0].attendanceHighGame.gamePk)
        assertEquals(	"/api/v1/game/71771/content", attendance.records[0].attendanceHighGame.content.link)
        assertEquals(72005, attendance.records[0].attendanceLowGame!!.gamePk)
        assertEquals("R", attendance.records[0].gameType.id)

        assertEquals(8764, attendance.aggregateTotals.openingsTotalAway)
    }

    @Test
    fun `Communication test of the awards endpoints`() = runTest {
        val award = client.awardsClient.getAwards()
        assertNotNull(award[0])
        assertEquals("Member of Hall of Fame", award[0].description)
        assertEquals("MLBHOF", award[0].id)
        assertEquals(null, award[0].league)
        assertEquals("Hall Of Fame",award[0].name)
        assertEquals(1, award[0].sport!!.id)
        assertEquals("/api/v1/sports/1", award[0].sport!!.link)
    }

    @Test
    fun `Communication test of the conferences endpoints`() = runTest {
        val conferences = client.conferencesClient.getConferences()
        assertNotNull(conferences[0])
        for(conference in conferences) {
            assertNotNull(conference.league)
            assertNotNull(conference.sport)
        }
    }

    @Test
    fun `Communication test of the divisions endpoints`() = runTest {
        val divisions = client.divisionsClient.getDivisions()
        assertNotNull(divisions[0])
        assertEquals("ASL-N", divisions[0].abbreviation)
        assertEquals(true, divisions[0].active)
        assertEquals(false, divisions[0].hasWildcard)
        assertEquals(6006, divisions[0].league.id)
        assertEquals(6005, divisions[0].sport.id)
        assertNull(divisions[0].numPlayoffTeams)
    }
}
