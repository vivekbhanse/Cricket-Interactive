package com.example.interactive.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.example.interactive.data.remote.dto.MatchDetail
import com.example.interactive.presentation.Dimens.MediumPadding1
import com.example.interactive.presentation.Dimens.MediumPadding3
import com.example.interactive.presentation.ui.theme.DarkRed


@Composable
fun HomeChildScreen(match: MatchDetail) {
    val teams = match.teams
    val series = match.matchdetail.series
    val venue = match.matchdetail.venue
    val matchInfo = match.matchdetail.match

    Column {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(DarkRed)
                .height(MediumPadding3),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "${teams.n4.nameFull} vs ${teams.n5.nameFull}",
                style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Bold),
                fontFamily = FontFamily.SansSerif,
                modifier = Modifier.fillMaxWidth()
            )
        }

        Spacer(modifier = Modifier.height(MediumPadding1))

        MatchDetails(series, venue, matchInfo)
    }
}
