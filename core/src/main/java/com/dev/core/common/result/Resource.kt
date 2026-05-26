package com.dev.core.common.result

sealed interface Resource<out T> {

    data class Success<T>(
        val data: T
    ) : Resource<T>

    data class Error(
        val message: String
    ) : Resource<Nothing>

    data object Loading : Resource<Nothing>
}