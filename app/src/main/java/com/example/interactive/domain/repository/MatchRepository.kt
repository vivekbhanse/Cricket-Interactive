package com.example.interactive.domain.repository

import SquadMatchData
import com.example.interactive.data.remote.dto.MatchDetail
import com.example.interactive.domain.ApiState
import kotlinx.coroutines.flow.Flow


interface MatchRepository {
    suspend fun getMatchDetails(): Flow<ApiState<MatchDetail>>
    suspend fun getSquadsDetails(): Flow<ApiState<SquadMatchData>>
}