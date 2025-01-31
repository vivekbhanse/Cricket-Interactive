package com.example.interactive.presentation.common

import Batting
import Bowling
import Player

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