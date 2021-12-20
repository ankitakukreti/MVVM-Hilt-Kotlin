package com.sample.explore.base

import com.sample.explore.network.ApiService
import javax.inject.Inject

class RemoteDataSource @Inject constructor(private val apiService: ApiService) {

    suspend fun getResponse() =
            apiService.getResponse()

}