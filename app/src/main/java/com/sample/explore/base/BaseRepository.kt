package com.sample.explore.base

import com.sample.explore.network.NetworkResult
import dagger.hilt.android.scopes.ActivityRetainedScoped
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

@ActivityRetainedScoped
class BaseRepository @Inject constructor(private val remoteDataSource: RemoteDataSource) : BaseApiResponse() {

        suspend fun getResponse(): Flow<NetworkResult<BaseApiResponse>> {
            return flow<NetworkResult<BaseApiResponse>> {
                emit(safeApiCall { remoteDataSource.getResponse() })
            }.flowOn(Dispatchers.IO)
        }
    }