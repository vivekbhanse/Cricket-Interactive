package com.example.interactive.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.interactive.data.remote.dto.Match
import com.example.interactive.data.remote.dto.Series
import com.example.interactive.data.remote.dto.Venue
import com.example.interactive.presentation.Dimens.Dimens16
import com.example.interactive.presentation.Dimens.Dimens8
import com.example.interactive.presentation.ui.theme.DarkBlue
import com.example.interactive.presentation.ui.theme.DarkRed


@Composable
fun MatchDetails(series: Series, venue: Venue, match: Match) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(Dimens16)
    ) {
        // Series Information
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(Dimens8)
                .background(DarkBlue),

            shape = RoundedCornerShape(Dimens8),
        ) {
            Column(
                modifier = Modifier.padding(Dimens16),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = series.name,
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif,
                )
                Spacer(modifier = Modifier.height(4.dp))
                HorizontalDivider(thickness = 2.dp, color = DarkRed)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = "Status: ${series.status}", fontSize = 14.sp, color = Color.Gray)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = "Tour: ${series.tourName}", fontSize = 14.sp, color = Color.Gray)
            }
        }
        Spacer(modifier = Modifier.height(Dimens8))

        // Venue Information
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(Dimens8)
                .background(Color.Transparent),

            shape = RoundedCornerShape(Dimens8),

            ) {
            Column(
                modifier = Modifier.padding(Dimens16),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Venue",
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif,
                )
                Spacer(modifier = Modifier.height(4.dp))
                HorizontalDivider(thickness = 2.dp, color = DarkRed)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = venue.name, fontSize = 14.sp, color = Color.Gray)
            }
        }

        Spacer(modifier = Modifier.height(Dimens16))

        // Match Details Card
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = Dimens8),
            shape = RoundedCornerShape(Dimens8),
        ) {
            Column(
                modifier = Modifier.padding(Dimens16),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Match Details",
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif
                )
                Spacer(modifier = Modifier.height(4.dp))
                HorizontalDivider(thickness = 2.dp, color = DarkRed)
                Spacer(modifier = Modifier.height(Dimens8))
                Text(text = "Live Coverage: ${match.livecoverage}", fontSize = 14.sp)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = "Match ID: ${match.id}", fontSize = 14.sp, color = Color.Gray)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = "Code: ${match.code}", fontSize = 14.sp, color = Color.Gray)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = "League: ${match.livecoverage}", fontSize = 14.sp)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = "Number: ${match.number}", fontSize = 14.sp)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = "Type: ${match.type}", fontSize = 14.sp)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = "Date: ${match.date}", fontSize = 14.sp)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = "Time: ${match.time}", fontSize = 14.sp)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = "Offset: ${match.offset}", fontSize = 14.sp)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = "Daynight: ${match.daynight}", fontSize = 14.sp)
            }
        }
    }
}
