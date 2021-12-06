package com.workwin.aurora.commons.model

/**
 * This is the data response class for API call
 *
 * Loading : Means API call is in progress
 * Success : API has success-200 response
 * Error :   All Api error can be handled by this
 */
sealed class Resource<out T> {
    /** This is use to show and hide loading */
    data class Loading(val isLoading: Boolean, val msg: String? = null) : Resource<Nothing>()
    /** This is use to send success */
    data class Success<T>(val data: T, val message: String? = null) : Resource<T>()
    /** This is use to send Error */
    data class Error<T>(
        val data: T? = null, val message: String? = null, val throwable: Throwable? = null,
        val responseCode: Int? = 0
    ) : Resource<T>()
    /** This is use to send No data */
    data class NoData(val msg: String? = null) : Resource<Nothing>()
    /** This is use for at start */
    data class Start<T>(val start :Boolean? = true): Resource<T>()
}
