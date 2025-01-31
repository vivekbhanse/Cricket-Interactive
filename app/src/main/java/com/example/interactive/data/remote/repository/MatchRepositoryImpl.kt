package com.example.interactive.data.remote.repository

import SquadMatchData
import com.example.interactive.data.remote.ApiService
import com.example.interactive.data.remote.dto.MatchDetail
import com.example.interactive.domain.ApiState
import com.example.interactive.domain.repository.MatchRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class MatchRepositoryImpl(private val api: ApiService) : MatchRepository {
    override suspend fun getMatchDetails(): Flow<ApiState<MatchDetail>> = flow {
        emit(ApiState.Loading)
        try {
            val response = api.getMatchDetails()
            if (response != null) {
                emit(ApiState.Success(response))
            } else {
                emit(ApiState.Error("API returned null"))
            }
        } catch (e: Exception) {
            emit(ApiState.Error("Failed to fetch data", e))
        }
    }

    override suspend fun getSquadsDetails(): Flow<ApiState<SquadMatchData>>  = flow {
        emit(ApiState.Loading)
        try {
            val response = api.getSquadsDetails()
            if (response != null) {
                emit(ApiState.Success(response))
            } else {
                emit(ApiState.Error("API returned null"))
            }
        } catch (e: Exception) {
            emit(ApiState.Error("Failed to fetch data", e))
        }
    }
}