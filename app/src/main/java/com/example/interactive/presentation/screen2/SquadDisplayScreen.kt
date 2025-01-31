package com.example.interactive.presentation.screen2


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import com.example.interactive.domain.ApiState
import com.example.interactive.presentation.common.ShimmerEffect
import com.example.interactive.presentation.components.DetailsTopBar

@Composable
fun SquadDisplayScreen(
    modifier: Modifier = Modifier,
    navigateUp: () -> Unit,
    model: SquadListViewModel
) {
    val matchState by model.matchSquads.collectAsState()
    val selectedOption = rememberSaveable  {
        mutableStateOf("Display All")
    }

    Column(modifier = Modifier
        .fillMaxSize()
        .statusBarsPadding()) {
        DetailsTopBar(
            onBookMarkClick = {},
            onBackClick = navigateUp,
            onOptionSelected = { selectedFilter ->
                selectedOption.value = selectedFilter
            }
        )

        when (matchState) {
            is ApiState.Success -> {
                val matchDetail = (matchState as ApiState.Success).data
                ShowSquadList(matchData = matchDetail, sortedType = selectedOption.value)
            }
            is ApiState.Loading -> {
               ShimmerEffect()
            }
            is ApiState.Error -> {
                Text(text = "Error: ${(matchState as ApiState.Error).message}")
            }
        }
    }
}