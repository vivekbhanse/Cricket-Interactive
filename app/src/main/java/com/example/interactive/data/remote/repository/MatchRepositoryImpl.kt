package com.example.interactive.data.remote.repository

import SquadMatchData
import com.example.interactive.data.remote.ApiService
import com.example.interactive.data.remote.dto.MatchDetail
import com.example.interactive.domain.ApiState
import com.example.interactive.domain.repository.MatchRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class MatchRepositoryImpl(private val api: ApiService) : MatchRepository {

    private suspend fun <T> fetchData(apiCall: suspend () -> T?): Flow<ApiState<T>> = flow {
        emit(ApiState.Loading)
        try {
            val response = apiCall()
            emit(response?.let { ApiState.Success(it) } ?: ApiState.Error("API returned null"))
        } catch (e: Exception) {
            emit(ApiState.Error("Failed to fetch data: ${e.localizedMessage}", e))
        }
    }

    override suspend fun getMatchDetails(): Flow<ApiState<MatchDetail>> =
        fetchData { api.getMatchDetails() }

    override suspend fun getSquadsDetails(): Flow<ApiState<SquadMatchData>> =
        fetchData { api.getSquadsDetails() }
}
