package com.example.interactive.data.remote.dto

import com.google.gson.annotations.SerializedName


data class MatchDetail(
    @SerializedName("Matchdetail")
    val matchdetail: RootDTO,
    @SerializedName("Nuggets")
    val nuggets: List<String>,
    @SerializedName("Innings")
    val innings: List<Inning>,
    @SerializedName("Teams")
    val teams: Teams,
    @SerializedName("Notes")
    val notes: Notes,
)

data class RootDTO(
    @SerializedName("Team_Home")
    val teamHome: String,
    @SerializedName("Team_Away")
    val teamAway: String,
    @SerializedName("Match")
    val match: Match,
    @SerializedName("Series")
    val series: Series,
    @SerializedName("Venue")
    val venue: Venue,
    @SerializedName("Officials")
    val officials: Officials,
    @SerializedName("Weather")
    val weather: String,
    @SerializedName("Tosswonby")
    val tosswonby: String,
    @SerializedName("Status")
    val status: String,
    @SerializedName("Status_Id")
    val statusId: String,
    @SerializedName("Player_Match")
    val playerMatch: String,
    @SerializedName("Result")
    val result: String,
    @SerializedName("Winningteam")
    val winningteam: String,
    @SerializedName("Winmargin")
    val winmargin: String,
    @SerializedName("Equation")
    val equation: String,
)

data class Match(
    @SerializedName("Livecoverage")
    val livecoverage: String,
    @SerializedName("Id")
    val id: String,
    @SerializedName("Code")
    val code: String,
    @SerializedName("League")
    val league: String,
    @SerializedName("Number")
    val number: String,
    @SerializedName("Type")
    val type: String,
    @SerializedName("Date")
    val date: String,
    @SerializedName("Time")
    val time: String,
    @SerializedName("Offset")
    val offset: String,
    @SerializedName("Daynight")
    val daynight: String,
)

data class Series(
    @SerializedName("Id")
    val id: String,
    @SerializedName("Name")
    val name: String,
    @SerializedName("Status")
    val status: String,
    @SerializedName("Tour")
    val tour: String,
    @SerializedName("Tour_Name")
    val tourName: String,
)

data class Venue(
    @SerializedName("Id")
    val id: String,
    @SerializedName("Name")
    val name: String,
)

data class Officials(
    @SerializedName("Umpires")
    val umpires: String,
    @SerializedName("Referee")
    val referee: String,
)

data class Inning(
    @SerializedName("Number")
    val number: String,
    @SerializedName("Battingteam")
    val battingteam: String,
    @SerializedName("Total")
    val total: String,
    @SerializedName("Wickets")
    val wickets: String,
    @SerializedName("Overs")
    val overs: String,
    @SerializedName("Runrate")
    val runrate: String,
    @SerializedName("Byes")
    val byes: String,
    @SerializedName("Legbyes")
    val legbyes: String,
    @SerializedName("Wides")
    val wides: String,
    @SerializedName("Noballs")
    val noballs: String,
    @SerializedName("Penalty")
    val penalty: String,
    @SerializedName("AllottedOvers")
    val allottedOvers: String,
    @SerializedName("Batsmen")
    val batsmen: List<Batsmen>,
    @SerializedName("Partnership_Current")
    val partnershipCurrent: PartnershipCurrent,
    @SerializedName("Bowlers")
    val bowlers: List<Bowler>,
    @SerializedName("FallofWickets")
    val fallofWickets: List<FallofWicket>,
    @SerializedName("PowerPlay")
    val powerPlay: PowerPlay,
    @SerializedName("Target")
    val target: String?,
)

data class Batsmen(
    @SerializedName("Batsman")
    val batsman: String,
    @SerializedName("Runs")
    val runs: String,
    @SerializedName("Balls")
    val balls: String,
    @SerializedName("Fours")
    val fours: String,
    @SerializedName("Sixes")
    val sixes: String,
    @SerializedName("Dots")
    val dots: String,
    @SerializedName("Strikerate")
    val strikerate: String,
    @SerializedName("Dismissal")
    val dismissal: String,
    @SerializedName("Howout")
    val howout: String,
    @SerializedName("Bowler")
    val bowler: String,
    @SerializedName("Fielder")
    val fielder: String,
    @SerializedName("Isonstrike")
    val isonstrike: Boolean?,
)

data class PartnershipCurrent(
    @SerializedName("Runs")
    val runs: String,
    @SerializedName("Balls")
    val balls: String,
    @SerializedName("Batsmen")
    val batsmen: List<Batsmen2>,
)

data class Batsmen2(
    @SerializedName("Batsman")
    val batsman: String,
    @SerializedName("Runs")
    val runs: String,
    @SerializedName("Balls")
    val balls: String,
)

data class Bowler(
    @SerializedName("Bowler")
    val bowler: String,
    @SerializedName("Overs")
    val overs: String,
    @SerializedName("Maidens")
    val maidens: String,
    @SerializedName("Runs")
    val runs: String,
    @SerializedName("Wickets")
    val wickets: String,
    @SerializedName("Economyrate")
    val economyrate: String,
    @SerializedName("Noballs")
    val noballs: String,
    @SerializedName("Wides")
    val wides: String,
    @SerializedName("Dots")
    val dots: String,
    @SerializedName("Isbowlingtandem")
    val isbowlingtandem: Boolean?,
    @SerializedName("Isbowlingnow")
    val isbowlingnow: Boolean?,
    @SerializedName("ThisOver")
    val thisOver: List<ThisOver>?,
)

data class ThisOver(
    @SerializedName("T")
    val t: String,
    @SerializedName("B")
    val b: String,
)

data class FallofWicket(
    @SerializedName("Batsman")
    val batsman: String,
    @SerializedName("Score")
    val score: String,
    @SerializedName("Overs")
    val overs: String,
)

data class PowerPlay(
    @SerializedName("PP1")
    val pp1: String,
    @SerializedName("PP2")
    val pp2: String,
)

data class Teams(
    @SerializedName("4")
    val n4: n4,
    @SerializedName("5")
    val n5: n5,
)


data class n4(
    @SerializedName("Name_Full")
    val nameFull: String,
    @SerializedName("Name_Short")
    val nameShort: String,
    @SerializedName("Players")
    val players: Players,
)

data class Players(
    @SerializedName("3852")
    val n3852: n3852,
    @SerializedName("3722")
    val n3722: n3722,
    @SerializedName("66818")
    val n66818: n66818,
    @SerializedName("4176")
    val n4176: n4176,
    @SerializedName("3632")
    val n3632: n3632,
    @SerializedName("4532")
    val n4532: n4532,
    @SerializedName("63751")
    val n63751: n63751,
    @SerializedName("63187")
    val n63187: n63187,
    @SerializedName("9844")
    val n9844: n9844,
    @SerializedName("5132")
    val n5132: n5132,
    @SerializedName("65867")
    val n65867: n65867,
)

data class n3852(
    @SerializedName("Position")
    val position: String,
    @SerializedName("Name_Full")
    val nameFull: String,
    @SerializedName("Iscaptain")
    val iscaptain: Boolean,
    @SerializedName("Batting")
    val batting: Batting,
    @SerializedName("Bowling")
    val bowling: Bowling,
)

data class Batting(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Strikerate")
    val strikerate: String,
    @SerializedName("Runs")
    val runs: String,
)

data class Bowling(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Economyrate")
    val economyrate: String,
    @SerializedName("Wickets")
    val wickets: String,
)

data class n3722(
    @SerializedName("Position")
    val position: String,
    @SerializedName("Name_Full")
    val nameFull: String,
    @SerializedName("Batting")
    val batting: Batting2,
    @SerializedName("Bowling")
    val bowling: Bowling2,
)

data class Batting2(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Strikerate")
    val strikerate: String,
    @SerializedName("Runs")
    val runs: String,
)

data class Bowling2(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Economyrate")
    val economyrate: String,
    @SerializedName("Wickets")
    val wickets: String,
)

data class n66818(
    @SerializedName("Position")
    val position: String,
    @SerializedName("Name_Full")
    val nameFull: String,
    @SerializedName("Batting")
    val batting: Batting3,
    @SerializedName("Bowling")
    val bowling: Bowling3,
)

data class Batting3(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Strikerate")
    val strikerate: String,
    @SerializedName("Runs")
    val runs: String,
)

data class Bowling3(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Economyrate")
    val economyrate: String,
    @SerializedName("Wickets")
    val wickets: String,
)

data class n4176(
    @SerializedName("Position")
    val position: String,
    @SerializedName("Name_Full")
    val nameFull: String,
    @SerializedName("Batting")
    val batting: Batting4,
    @SerializedName("Bowling")
    val bowling: Bowling4,
)

data class Batting4(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Strikerate")
    val strikerate: String,
    @SerializedName("Runs")
    val runs: String,
)

data class Bowling4(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Economyrate")
    val economyrate: String,
    @SerializedName("Wickets")
    val wickets: String,
)

data class n3632(
    @SerializedName("Position")
    val position: String,
    @SerializedName("Name_Full")
    val nameFull: String,
    @SerializedName("Iskeeper")
    val iskeeper: Boolean,
    @SerializedName("Batting")
    val batting: Batting5,
    @SerializedName("Bowling")
    val bowling: Bowling5,
)

data class Batting5(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Strikerate")
    val strikerate: String,
    @SerializedName("Runs")
    val runs: String,
)

data class Bowling5(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Economyrate")
    val economyrate: String,
    @SerializedName("Wickets")
    val wickets: String,
)

data class n4532(
    @SerializedName("Position")
    val position: String,
    @SerializedName("Name_Full")
    val nameFull: String,
    @SerializedName("Batting")
    val batting: Batting6,
    @SerializedName("Bowling")
    val bowling: Bowling6,
)

data class Batting6(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Strikerate")
    val strikerate: String,
    @SerializedName("Runs")
    val runs: String,
)

data class Bowling6(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Economyrate")
    val economyrate: String,
    @SerializedName("Wickets")
    val wickets: String,
)

data class n63751(
    @SerializedName("Position")
    val position: String,
    @SerializedName("Name_Full")
    val nameFull: String,
    @SerializedName("Batting")
    val batting: Batting7,
    @SerializedName("Bowling")
    val bowling: Bowling7,
)

data class Batting7(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Strikerate")
    val strikerate: String,
    @SerializedName("Runs")
    val runs: String,
)

data class Bowling7(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Economyrate")
    val economyrate: String,
    @SerializedName("Wickets")
    val wickets: String,
)

data class n63187(
    @SerializedName("Position")
    val position: String,
    @SerializedName("Name_Full")
    val nameFull: String,
    @SerializedName("Batting")
    val batting: Batting8,
    @SerializedName("Bowling")
    val bowling: Bowling8,
)

data class Batting8(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Strikerate")
    val strikerate: String,
    @SerializedName("Runs")
    val runs: String,
)

data class Bowling8(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Economyrate")
    val economyrate: String,
    @SerializedName("Wickets")
    val wickets: String,
)

data class n9844(
    @SerializedName("Position")
    val position: String,
    @SerializedName("Name_Full")
    val nameFull: String,
    @SerializedName("Batting")
    val batting: Batting9,
    @SerializedName("Bowling")
    val bowling: Bowling9,
)

data class Batting9(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Strikerate")
    val strikerate: String,
    @SerializedName("Runs")
    val runs: String,
)

data class Bowling9(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Economyrate")
    val economyrate: String,
    @SerializedName("Wickets")
    val wickets: String,
)

data class n5132(
    @SerializedName("Position")
    val position: String,
    @SerializedName("Name_Full")
    val nameFull: String,
    @SerializedName("Batting")
    val batting: Batting10,
    @SerializedName("Bowling")
    val bowling: Bowling10,
)

data class Batting10(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Strikerate")
    val strikerate: String,
    @SerializedName("Runs")
    val runs: String,
)

data class Bowling10(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Economyrate")
    val economyrate: String,
    @SerializedName("Wickets")
    val wickets: String,
)

data class n65867(
    @SerializedName("Position")
    val position: String,
    @SerializedName("Name_Full")
    val nameFull: String,
    @SerializedName("Batting")
    val batting: Batting11,
    @SerializedName("Bowling")
    val bowling: Bowling11,
)

data class Batting11(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Strikerate")
    val strikerate: String,
    @SerializedName("Runs")
    val runs: String,
)

data class Bowling11(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Economyrate")
    val economyrate: String,
    @SerializedName("Wickets")
    val wickets: String,
)

data class n5(
    @SerializedName("Name_Full")
    val nameFull: String,
    @SerializedName("Name_Short")
    val nameShort: String,
    @SerializedName("Players")
    val players: Players2,
)

data class Players2(
    @SerializedName("4964")
    val n4964: n4964,
    @SerializedName("57594")
    val n57594: n57594,
    @SerializedName("4330")
    val n4330: n4330,
    @SerializedName("3752")
    val n3752: n3752,
    @SerializedName("10167")
    val n10167: n10167,
    @SerializedName("10172")
    val n10172: n10172,
    @SerializedName("57903")
    val n57903: n57903,
    @SerializedName("11703")
    val n11703: n11703,
    @SerializedName("11706")
    val n11706: n11706,
    @SerializedName("60544")
    val n60544: n60544,
    @SerializedName("4338")
    val n4338: n4338,
)

data class n4964(
    @SerializedName("Position")
    val position: String,
    @SerializedName("Name_Full")
    val nameFull: String,
    @SerializedName("Batting")
    val batting: Batting12,
    @SerializedName("Bowling")
    val bowling: Bowling12,
)

data class Batting12(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Strikerate")
    val strikerate: String,
    @SerializedName("Runs")
    val runs: String,
)

data class Bowling12(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Economyrate")
    val economyrate: String,
    @SerializedName("Wickets")
    val wickets: String,
)

data class n57594(
    @SerializedName("Position")
    val position: String,
    @SerializedName("Name_Full")
    val nameFull: String,
    @SerializedName("Batting")
    val batting: Batting13,
    @SerializedName("Bowling")
    val bowling: Bowling13,
)

data class Batting13(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Strikerate")
    val strikerate: String,
    @SerializedName("Runs")
    val runs: String,
)

data class Bowling13(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Economyrate")
    val economyrate: String,
    @SerializedName("Wickets")
    val wickets: String,
)

data class n4330(
    @SerializedName("Position")
    val position: String,
    @SerializedName("Name_Full")
    val nameFull: String,
    @SerializedName("Iscaptain")
    val iscaptain: Boolean,
    @SerializedName("Batting")
    val batting: Batting14,
    @SerializedName("Bowling")
    val bowling: Bowling14,
)

data class Batting14(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Strikerate")
    val strikerate: String,
    @SerializedName("Runs")
    val runs: String,
)

data class Bowling14(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Economyrate")
    val economyrate: String,
    @SerializedName("Wickets")
    val wickets: String,
)

data class n3752(
    @SerializedName("Position")
    val position: String,
    @SerializedName("Name_Full")
    val nameFull: String,
    @SerializedName("Batting")
    val batting: Batting15,
    @SerializedName("Bowling")
    val bowling: Bowling15,
)

data class Batting15(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Strikerate")
    val strikerate: String,
    @SerializedName("Runs")
    val runs: String,
)

data class Bowling15(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Economyrate")
    val economyrate: String,
    @SerializedName("Wickets")
    val wickets: String,
)

data class n10167(
    @SerializedName("Position")
    val position: String,
    @SerializedName("Name_Full")
    val nameFull: String,
    @SerializedName("Iskeeper")
    val iskeeper: Boolean,
    @SerializedName("Batting")
    val batting: Batting16,
    @SerializedName("Bowling")
    val bowling: Bowling16,
)

data class Batting16(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Strikerate")
    val strikerate: String,
    @SerializedName("Runs")
    val runs: String,
)

data class Bowling16(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Economyrate")
    val economyrate: String,
    @SerializedName("Wickets")
    val wickets: String,
)

data class n10172(
    @SerializedName("Position")
    val position: String,
    @SerializedName("Name_Full")
    val nameFull: String,
    @SerializedName("Batting")
    val batting: Batting17,
    @SerializedName("Bowling")
    val bowling: Bowling17,
)

data class Batting17(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Strikerate")
    val strikerate: String,
    @SerializedName("Runs")
    val runs: String,
)

data class Bowling17(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Economyrate")
    val economyrate: String,
    @SerializedName("Wickets")
    val wickets: String,
)

data class n57903(
    @SerializedName("Position")
    val position: String,
    @SerializedName("Name_Full")
    val nameFull: String,
    @SerializedName("Batting")
    val batting: Batting18,
    @SerializedName("Bowling")
    val bowling: Bowling18,
)

data class Batting18(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Strikerate")
    val strikerate: String,
    @SerializedName("Runs")
    val runs: String,
)

data class Bowling18(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Economyrate")
    val economyrate: String,
    @SerializedName("Wickets")
    val wickets: String,
)

data class n11703(
    @SerializedName("Position")
    val position: String,
    @SerializedName("Name_Full")
    val nameFull: String,
    @SerializedName("Batting")
    val batting: Batting19,
    @SerializedName("Bowling")
    val bowling: Bowling19,
)

data class Batting19(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Strikerate")
    val strikerate: String,
    @SerializedName("Runs")
    val runs: String,
)

data class Bowling19(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Economyrate")
    val economyrate: String,
    @SerializedName("Wickets")
    val wickets: String,
)

data class n11706(
    @SerializedName("Position")
    val position: String,
    @SerializedName("Name_Full")
    val nameFull: String,
    @SerializedName("Batting")
    val batting: Batting20,
    @SerializedName("Bowling")
    val bowling: Bowling20,
)

data class Batting20(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Strikerate")
    val strikerate: String,
    @SerializedName("Runs")
    val runs: String,
)

data class Bowling20(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Economyrate")
    val economyrate: String,
    @SerializedName("Wickets")
    val wickets: String,
)

data class n60544(
    @SerializedName("Position")
    val position: String,
    @SerializedName("Name_Full")
    val nameFull: String,
    @SerializedName("Batting")
    val batting: Batting21,
    @SerializedName("Bowling")
    val bowling: Bowling21,
)

data class Batting21(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Strikerate")
    val strikerate: String,
    @SerializedName("Runs")
    val runs: String,
)

data class Bowling21(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Economyrate")
    val economyrate: String,
    @SerializedName("Wickets")
    val wickets: String,
)

data class n4338(
    @SerializedName("Position")
    val position: String,
    @SerializedName("Name_Full")
    val nameFull: String,
    @SerializedName("Batting")
    val batting: Batting22,
    @SerializedName("Bowling")
    val bowling: Bowling22,
)

data class Batting22(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Strikerate")
    val strikerate: String,
    @SerializedName("Runs")
    val runs: String,
)

data class Bowling22(
    @SerializedName("Style")
    val style: String,
    @SerializedName("Average")
    val average: String,
    @SerializedName("Economyrate")
    val economyrate: String,
    @SerializedName("Wickets")
    val wickets: String,
)

data class Notes(
    @SerializedName("1")
    val n1: List<String>,
    @SerializedName("2")
    val n2: List<String>,
)
