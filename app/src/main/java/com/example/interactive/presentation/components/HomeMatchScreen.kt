package com.example.interactive.presentation.components


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier

import androidx.compose.ui.graphics.Color
import com.example.interactive.domain.ApiState
import com.example.interactive.presentation.Dimens.MediumPadding1
import com.example.interactive.presentation.common.ShimmerEffect
import com.example.interactive.presentation.screen1.HomeViewModel


@Composable
fun HomeMatchScreen(viewModel: HomeViewModel) {
    val matchState by viewModel.match.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(MediumPadding1)
            .statusBarsPadding()
    ) {


        when (matchState) {
            is ApiState.Loading ->{
                ShimmerEffect()
            }

            is ApiState.Success -> {
                val match = (matchState as ApiState.Success).data
                HomeChildScreen(match)
            }

            is ApiState.Error -> {
                val errorMessage = (matchState as ApiState.Error).message
                Text(text = "Error: $errorMessage", color = Color.Red)
            }
        }
    }



}