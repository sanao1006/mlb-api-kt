package app.sanao1006.mlbapi

import kotlinx.coroutines.test.runTest
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class EndpointTest {
    private val client = MlbClient()

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
}
