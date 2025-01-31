package com.example.interactive.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.interactive.data.remote.dto.MatchDetail
import com.example.interactive.presentation.Dimens.MediumPadding1
import com.example.interactive.presentation.Dimens.MediumPadding3
import com.example.interactive.presentation.ui.theme.DarkRed


@Composable
fun HomeChildScreen(match: MatchDetail) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(MediumPadding3)
            .background(DarkRed),
        contentAlignment = Alignment.Center // Centers the text inside the Box
    ) {
        Text(
            text = "${match.teams.n4.nameFull} vs ${match.teams.n5.nameFull}",
            fontSize = 24.sp, // Setting text size
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
            textAlign = TextAlign.Center, // Center-align text
            modifier = Modifier.fillMaxWidth() // Ensures text takes full width
        )
    }
    Spacer(modifier = Modifier.height(MediumPadding1))
    MatchDetails(match.matchdetail.series, match.matchdetail.venue, match.matchdetail.match)

}
