package com.example.interactive.presentation.screen1

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.interactive.data.remote.dto.MatchDetail
import com.example.interactive.domain.ApiState
import com.example.interactive.domain.usecases.GetMatchDetailsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val matchDetailsUseCase: GetMatchDetailsUseCase) :
    ViewModel() {

    private val _match = MutableStateFlow<ApiState<MatchDetail>>(ApiState.Loading)
    val match: StateFlow<ApiState<MatchDetail>> = _match

    init {
        getMatchDetails()
    }

    private fun getMatchDetails() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                matchDetailsUseCase().collect { matchDetail ->
                    _match.value = matchDetail
                }
            } catch (e: Exception) {
                Log.d("HomeViewModel", e.message ?: "Something Went Wrong !!")
            }

        }


    }
}