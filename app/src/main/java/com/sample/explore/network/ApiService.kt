package com.sample.explore.network

import com.sample.explore.base.BaseApiResponse
import com.sample.explore.utility.utils.Constants
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET(Constants.BASE_URL)
    suspend fun getResponse(): Response<BaseApiResponse>
}