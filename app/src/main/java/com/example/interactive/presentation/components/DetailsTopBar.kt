package com.example.interactive.presentation.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import com.example.interactive.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun DetailsTopBar(
    onBookMarkClick: () -> Unit, onBackClick: () -> Unit, onOptionSelected:(String) ->Unit
) {
    var selectedOption by remember { mutableStateOf("Display All") }

    TopAppBar(modifier = Modifier.fillMaxWidth(), colors = TopAppBarDefaults.mediumTopAppBarColors(
        containerColor = Color.Transparent,
        actionIconContentColor = colorResource(id = R.color.body),
        navigationIconContentColor = colorResource(id = R.color.body),
    ), title = {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.Center)
        ) {
            Text(text = selectedOption)
        }
    }, navigationIcon = {
        IconButton(onClick = onBackClick) {
            Icon(
                painter = painterResource(id = R.drawable.ic_back_arrow),
                contentDescription = null, tint = Color.White
            )
        }
    }, actions = {
        OverflowMenu(
            onOptionSelected = {
                selectedOption = it
                onOptionSelected(it) // Notify previous screen about the change
            }
        )

    })
}

