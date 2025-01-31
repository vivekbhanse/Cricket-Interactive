package com.example.interactive.domain.usecases



import SquadMatchData
import com.example.interactive.domain.ApiState
import com.example.interactive.domain.repository.MatchRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetSquadDetailsUseCase @Inject constructor(
    private val matchRepository: MatchRepository
) {
    suspend operator fun invoke(): Flow<ApiState<SquadMatchData>> = matchRepository.getSquadsDetails()
    

}