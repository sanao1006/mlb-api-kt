package app.sanao1006.mlbapi.client.jobs

import app.sanao1006.mlbapi.model.jobs.JobsResponse
import com.skydoves.sandwich.ApiResponse
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.Query

interface JobsClient {
    @GET("jobs")
    suspend fun getJobs(
        @Query("jobType") jobType: String,
        @Query("sportId") sportId: Int?,
        @Query("date") date: String?,
        @Query("fields") fields: String?
    ): ApiResponse<JobsResponse>
}
