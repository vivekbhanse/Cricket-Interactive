package com.example.interactive.domain

sealed class ApiState<out T> {
    data class Success<out T>(val data: T) : ApiState<T>()
    data class Error(val message: String, val throwable: Throwable? = null) : ApiState<Nothing>()
    object Loading : ApiState<Nothing>()
}