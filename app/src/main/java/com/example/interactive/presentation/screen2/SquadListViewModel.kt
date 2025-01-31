package com.example.interactive.presentation.screen2

import SquadMatchData
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.interactive.domain.ApiState
import com.example.interactive.domain.usecases.GetSquadDetailsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SquadListViewModel @Inject constructor(private val getSquadDetailsUseCase: GetSquadDetailsUseCase) : ViewModel() {
    private val _matchSquads = MutableStateFlow<ApiState<SquadMatchData>>(ApiState.Loading)
    val matchSquads: StateFlow<ApiState<SquadMatchData>> = _matchSquads

    init {
        getMatchSquadDetails()
    }

    private fun getMatchSquadDetails() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                getSquadDetailsUseCase().collect { matchDetail ->
                    _matchSquads.value = matchDetail
                }
            } catch (e: Exception) {
                Log.d("SquadListViewModel", e.message ?: "Something Went Wrong !!")
            }

        }


    }

}