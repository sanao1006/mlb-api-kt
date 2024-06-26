package app.sanao1006.mlbapi.client.jobs

import app.sanao1006.mlbapi.model.jobs.JobType
import app.sanao1006.mlbapi.model.jobs.JobsDatacastersResponse
import app.sanao1006.mlbapi.model.jobs.JobsOfficialScoresResponse
import app.sanao1006.mlbapi.model.jobs.JobsResponse
import app.sanao1006.mlbapi.model.jobs.JobsUmpiresResponse
import app.sanao1006.mlbapi.model.jobs.Roster
import com.skydoves.sandwich.ApiResponse

class JobsClientImpl(
    private val jobsClient: JobsClient
) {
    suspend fun getJobs(
        jobType: JobType,
        sportId: Int? = null,
        date: String? = null,
        fields: String? = null
    ): List<Roster> =
        jobsClient.getJobs(
            jobType = jobType.value,
            sportId = sportId,
            date = date,
            fields = fields
        ).toList()

    suspend fun getJobsUmpires(
        sportId: Int? = null,
        date: String? = null,
        fields: String? = null
    ): List<Roster> =
        jobsClient.getJobsUmpires(
            sportId = sportId,
            date = date,
            fields = fields
        ).toList()

    suspend fun getJobsDatacasters(
        sportId: Int? = null,
        date: String? = null,
        fields: String? = null
    ): List<Roster> =
        jobsClient.getJobsDatacasters(
            sportId = sportId,
            date = date,
            fields = fields
        ).toList()

    suspend fun getJobsOfficialScores(
        timecode: String? = null,
        fields: String? = null
    ): List<Roster> =
        jobsClient.getJobsOfficialScores(
            timecode = timecode,
            fields = fields
        ).toList()

    private fun ApiResponse<JobsResponse>.toList(): List<Roster> =
        when (this) {
            is ApiResponse.Success -> this.data.roster
            is ApiResponse.Failure -> emptyList()
        }

    @JvmName("JobsUmpiresResponseToRosterList")
    private fun ApiResponse<JobsUmpiresResponse>.toList(): List<Roster> =
        when (this) {
            is ApiResponse.Success -> this.data.roster
            is ApiResponse.Failure -> emptyList()
        }

    @JvmName("JobsDatacastersResponseToRosterList")
    private fun ApiResponse<JobsDatacastersResponse>.toList(): List<Roster> =
        when (this) {
            is ApiResponse.Success -> this.data.roster
            is ApiResponse.Failure -> emptyList()
        }
    @JvmName("JobsOfficialScoresResponseToRosterList")
    private fun ApiResponse<JobsOfficialScoresResponse>.toList(): List<Roster> =
        when (this) {
            is ApiResponse.Success -> this.data.roster
            is ApiResponse.Failure -> emptyList()
        }
}