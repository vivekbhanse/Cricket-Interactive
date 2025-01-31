package com.example.interactive.presentation.screen2


import Batting
import Bowling
import Player
import SquadMatchData
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.interactive.presentation.ui.theme.DarkBlue
import com.example.interactive.presentation.ui.theme.DarkPink
import com.example.interactive.presentation.ui.theme.DarkRed


@Composable
fun ShowSquadList(matchData: SquadMatchData, sortedType: String) {

    val teamNam = matchData.teams.team6.nameFull
    val teamNam2 = matchData.teams.team7.nameFull

    val teamPlayersMap = remember {
        mutableStateMapOf(teamNam to matchData.teams.team6.players.values.map { parsePlayer(it.toString()) },
            teamNam2 to matchData.teams.team7.players.values.map { parsePlayer(it.toString()) })
    }

    val filteredTeams = remember(sortedType) {
        when (sortedType) {
            "Team B" -> listOf(teamNam to (teamPlayersMap[teamNam] ?: emptyList()))
            "Team A" -> listOf(teamNam2 to (teamPlayersMap[teamNam2] ?: emptyList()))
            else -> teamPlayersMap.toList() // Convert the entire map to a list
        }
    }
    var selectedPlayer by remember { mutableStateOf<Player?>(null) }
    LazyColumn {
        filteredTeams.forEach { (teamName, players) ->
            item {
                Text(
                    text = teamName,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .background(DarkRed)
                        .padding(8.dp)
                )
            }
            items(players.size) { index ->
                val backgroundColor = if (index % 2 == 0) DarkBlue else DarkPink // LightBlue and LightPink

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .clickable { selectedPlayer = players[index] } // Open dialog on Card click
                        .background(Color.Transparent),
                    shape = RoundedCornerShape(16.dp),
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(backgroundColor) // Apply background inside the Row
                            .padding(8.dp) // Inner padding
                    ) {
                        Text(
                            text = (index + 1).toString().plus("."),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(16.dp)
                        )
                        Text(
                            text = players[index].nameFull,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(16.dp),

                        )

                        val playerStatus = when {
                            players[index].isCaptain == true && players[index].isKeeper == true -> "(c & wk)"
                            players[index].isKeeper == true -> "(wk)"
                            players[index].isCaptain == true -> "(c)"
                            else -> null
                        }

                        playerStatus?.let {
                            println(players[index].nameFull.plus(" ").plus(it))
                            Text(
                                text = it,
                                fontSize = 12.sp,
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .padding(16.dp)
                                    .background(DarkRed) // Optional: Background color inside the card
                            )
                        }

                    }

                }
            }
        }
    }
    // Dialog to show player details
    selectedPlayer?.let { player ->
        AlertDialog(
            onDismissRequest = { selectedPlayer = null }, // Close dialog when dismissed
            title = { Text(text = player.nameFull, fontWeight = FontWeight.Bold) },
            text = {
                Column {
                    Text("Batting Style: ${player.batting}")
                    Text("Batting Average: ${player.batting}")
                    Text("Runs: ${player.batting.runs}")
                    Text("Bowling Style: ${player.bowling}")
                    Text("Wickets: ${player.bowling.wickets}")
                }
            },
            confirmButton = {
                Button(onClick = { selectedPlayer = null }) {
                    Text("Close")
                }
            }
        )
    }

}

fun parsePlayer(input: String): Player {
    val position = Regex("position=(\\d+)").find(input)?.groupValues?.get(1)?.toInt() ?: 0
    val nameFull = Regex("nameFull=([^,]+)").find(input)?.groupValues?.get(1) ?: ""

    val battingStyle =
        Regex("batting=Batting\\(style=([^,]+)").find(input)?.groupValues?.get(1) ?: ""
    val battingAverage =
        Regex("average=([\\d.]+)").find(input)?.groupValues?.get(1)?.toDouble() ?: 0.0
    val battingStrikeRate =
        Regex("strikerate=([\\d.]+)").find(input)?.groupValues?.get(1)?.toDouble() ?: 0.0
    val battingRuns = Regex("runs=(\\d+)").find(input)?.groupValues?.get(1)?.toInt() ?: 0

    val bowlingStyle =
        Regex("bowling=Bowling\\(style=([^,]+)").find(input)?.groupValues?.get(1) ?: ""
    val bowlingAverage =
        Regex("average=([\\d.]+)").find(input)?.groupValues?.get(1)?.toDouble() ?: 0.0
    val bowlingEconomyRate =
        Regex("economyRate=([\\d.]+)").find(input)?.groupValues?.get(1)?.toDouble() ?: 0.0
    val bowlingWickets = Regex("wickets=(\\d+)").find(input)?.groupValues?.get(1)?.toInt() ?: 0

    val isCaptain = Regex("(?i)isCaptain=([^,]+)").find(input)?.groupValues?.get(1)?.toBoolean() ?: false
    val isKeeper = Regex("(?i)isKeeper=([^,]+)").find(input)?.groupValues?.get(1)?.toBoolean() ?: false
    val batting = Batting(
        battingStyle,
        battingAverage.toString(),
        battingStrikeRate.toString(),
        battingRuns.toString()
    )
    val bowling = Bowling(
        bowlingStyle,
        bowlingAverage.toString(),
        bowlingEconomyRate.toString(),
        bowlingWickets.toString()
    )

    return Player(position.toString(), nameFull, batting, bowling, isCaptain, isKeeper)
}