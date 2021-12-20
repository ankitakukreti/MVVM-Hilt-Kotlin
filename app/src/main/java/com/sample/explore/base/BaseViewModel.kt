package com.sample.explore.base

import android.app.Application
import androidx.lifecycle.*
import com.sample.explore.network.NetworkResult
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class BaseViewModel @Inject constructor(private val repository: BaseRepository, application: Application) : AndroidViewModel(application) {

    private val _response: MutableLiveData<NetworkResult<BaseApiResponse>> = MutableLiveData()
    val response: LiveData<NetworkResult<BaseApiResponse>> = _response

    fun fetchResponse() = viewModelScope.launch {
//        repository.getResponse().collect { values ->
//            _response.value = values
//        }
    }
}