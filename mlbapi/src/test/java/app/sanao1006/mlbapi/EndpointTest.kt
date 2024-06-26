package app.sanao1006.mlbapi

import kotlinx.coroutines.test.runTest
import org.junit.Test
import java.net.ConnectException
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull

class EndpointTest {
    private val client = MlbClient()

    @Test
    fun `Communication test of the attendance endpoint`() = runTest {
        val attendance = client.attendanceClient.getAttendance(teamId = 111, leagueId = 103, leagueListId = "mlb")
        assertEquals(true, attendance.records.isNotEmpty())
        assertNotNull(attendance.aggregateTotals)
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

    @Test
    fun `Communication test of the draft endpoint`() = runTest {
        val draft = client.draftClient.getDrafts(year = 2023)
        assertEquals(2023, draft.draftYear)
        assertNotNull(draft.rounds[0])
        val firstRound = draft.rounds[0]
        assertEquals("1", firstRound.round)
        assertNotNull(firstRound.picks[0])
        val firstPick = firstRound.picks[0]
        assertEquals(5010764, firstPick.bisPlayerId)
        assertEquals("9721000", firstPick.pickValue)
    }

    @Test
    fun `Communication test of the highLow endpoint`() = runTest {
        val highLow = client.highLowClient.getHighLow("team")
        assertEquals(true, highLow.isNotEmpty())
        val highLowResult = highLow.last()
        assertEquals(true, highLowResult.combinedStats)
        assertEquals("Regular Season", highLowResult.gameType.description)
        assertEquals("hitting", highLowResult.group.displayName)
        assertEquals(listOf("PLAYER", "TEAM", "GAME"), highLowResult.sortStat.highLowTypes)
    }

    @Test
    fun `Communication test of the homeRunDerby endpoint`() = runTest {
        val homeRunDerby = client.homeRunDerbyClient.getHomeRunDerby(511101)
        assertEquals("All-Star Workout Day: Home Run Derby", homeRunDerby.info.name)
    }

    @Test
    fun `Communication test of the league endpoint`() = runTest {
        val league = client.leagueClient.getLeagues(sportId = 1, leagueIds = 103)
        assertEquals(true, league.isNotEmpty())
        val first = league[0]
        assertEquals("AL", first.abbreviation)
        assertEquals("American League", first.name)
        assertEquals(1, first.sport.id)
    }

    @Test
    fun `Communication test of the league allStarBallot endpoint`() = runTest {
        val allStarBallot = client.leagueClient.getAllStartBallot(leagueId = 103, season = 2023)
        assertEquals(true, allStarBallot.isNotEmpty())
        val first = allStarBallot[0]
        assertEquals("José Abreu", first.fullName)
        assertEquals("First Base", first.primaryPosition!!.name)
        assertEquals("Right", first.pitchHand.description)
        assertEquals("Right", first.batSide.description)
    }

    @Test
    fun `Communication test of the league allStarWriteIns endpoint`() = runTest {
        val allStarWriteIns = client.leagueClient.getAllStarWriteIns(leagueId = 103, season = 2023)
        assertEquals(true, allStarWriteIns.isNotEmpty())
        val first = allStarWriteIns[0]
        assertEquals("Michael Stefanic", first.fullName)
        assertNull(first.primaryPosition)
        assertEquals("Right", first.pitchHand.description)
        assertEquals("Right", first.batSide.description)
    }

    @Test
    fun `Communication test of the league allStarFinalVote endpoint`() = runTest {
        val allStarFinalVote = client.leagueClient.getAllStartFinalVote(leagueId = 103, season = 2023)
        assertEquals(true, allStarFinalVote.isNotEmpty())
        val first = allStarFinalVote[0]
        assertEquals("Shohei Ohtani", first.fullName)
        assertEquals("Designated Hitter", first.primaryPosition!!.name)
        assertEquals("Right", first.pitchHand.description)
        assertEquals("Left", first.batSide.description)
    }

    @Test
    fun `Communication test of the people endpoint`() = runTest {
        val people = client.peopleClient.getPeople(personIds = 660271)
        assertEquals(true, people.isNotEmpty())
        val person = people[0]
        assertEquals("Shohei Ohtani", person.fullName)
        assertEquals("Showtime", person.nickName)
        assertEquals("Left", person.batSide.description)
        assertEquals("TWP", person.primaryPosition.abbreviation)
        assertEquals("Two-Way Player", person.primaryPosition.name)
    }

    @Test
    fun `Communication test of the people freeAgents endpoint`() = runTest {
        val freeAgents = client.peopleClient.getPeopleFreeAgents(leagueId = 103, season = 2023)
        assertEquals("2023", freeAgents.season)
        assertEquals(true, freeAgents.freeAgents.isNotEmpty())
        val person = freeAgents.freeAgents[1]
        assertEquals("Cory Abbott", person.player.fullName)
        assertEquals("Seattle Mariners", person.newTeam.name)
        assertEquals("Washington Nationals", person.originalTeam.name)
        assertEquals("RP", person.position.abbreviation)
    }

    @Test()
    fun `Communication test of the person endpoint`() = runTest {
        val people = client.peopleClient.getPerson(personId = 660271)
        assertEquals(true, people.isNotEmpty())
        val person = people[0]
        assertEquals("Shohei Ohtani", person.fullName)
        assertEquals("Showtime", person.nickName)
        assertEquals("Left", person.batSide.description)
        assertEquals("TWP", person.primaryPosition.abbreviation)
        assertEquals("Two-Way Player", person.primaryPosition.name)

        try {
            val failCase = client.peopleClient.getPerson(personId = 1)
        } catch(e: ConnectException) {
            assertEquals("connection error", e.message)
        }
    }

    @Test
    fun `Communication test of the person stats endpoint`() = runTest {
        val stats = client.peopleClient.getPersonStats(personId = 660271, gamePk = 746163)
        assertEquals(true, stats.isNotEmpty())
        // TODO create test cases
    }

    @Test
    fun `Communication test of the standings endpoint`() = runTest {
        val standings = client.standingsClient.getStandings(leagueId = 103)
        assertEquals(true, standings.isNotEmpty())
        val standing = standings[0]
        assertEquals(201, standing.division.id)
        for (teamRecord in standing.teamRecords) {
            assertNotNull(teamRecord.clinched)
        }
    }

    @Test
    fun `Communication test of the stats endpoint`() = runTest {
        val pitchingStats = client.statsClient.getStats(stats = "season", group = "pitching", season = "2023")
        assertEquals(true, pitchingStats.isNotEmpty())
        println(pitchingStats.toString())
        // TODO create test cases
    }
}
