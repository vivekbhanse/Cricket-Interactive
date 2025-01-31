package com.example.interactive.domain.usecases



import com.example.interactive.data.remote.dto.MatchDetail
import com.example.interactive.domain.ApiState
import com.example.interactive.domain.repository.MatchRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetMatchDetailsUseCase @Inject constructor(
    private val matchRepository: MatchRepository
) {
     operator suspend fun invoke(): Flow<ApiState<MatchDetail>> = matchRepository.getMatchDetails()
}