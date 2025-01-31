import com.google.gson.annotations.SerializedName

data class SquadMatchData(
    @SerializedName("Matchdetail") val matchDetail: MatchDetail,
    @SerializedName("Nuggets") val nuggets: List<String>,
    @SerializedName("Innings") val innings: List<Inning>,
    @SerializedName("Teams") val teams: Teams,
    @SerializedName("Notes") val notes: Notes
)

data class MatchDetail(
    @SerializedName("Team_Home") val teamHome: String,
    @SerializedName("Team_Away") val teamAway: String,
    @SerializedName("Match") val match: Match,
    @SerializedName("Series") val series: Series,
    @SerializedName("Venue") val venue: Venue,
    @SerializedName("Officials") val officials: Officials,
    @SerializedName("Weather") val weather: String,
    @SerializedName("Tosswonby") val tossWonBy: String,
    @SerializedName("Status") val status: String,
    @SerializedName("Status_Id") val statusId: String,
    @SerializedName("Player_Match") val playerMatch: String,
    @SerializedName("Result") val result: String,
    @SerializedName("Winningteam") val winningTeam: String,
    @SerializedName("Winmargin") val winMargin: String,
    @SerializedName("Equation") val equation: String
)

data class Match(
    @SerializedName("Livecoverage") val liveCoverage: String,
    @SerializedName("Id") val id: String,
    @SerializedName("Code") val code: String,
    @SerializedName("League") val league: String,
    @SerializedName("Number") val number: String,
    @SerializedName("Type") val type: String,
    @SerializedName("Date") val date: String,
    @SerializedName("Time") val time: String,
    @SerializedName("Offset") val offset: String,
    @SerializedName("Daynight") val dayNight: String
)

data class Series(
    @SerializedName("Id") val id: String,
    @SerializedName("Name") val name: String,
    @SerializedName("Status") val status: String,
    @SerializedName("Tour") val tour: String,
    @SerializedName("Tour_Name") val tourName: String
)

data class Venue(
    @SerializedName("Id") val id: String,
    @SerializedName("Name") val name: String
)

data class Officials(
    @SerializedName("Umpires") val umpires: String,
    @SerializedName("Referee") val referee: String
)

data class Inning(
    @SerializedName("Number") val number: String,
    @SerializedName("Battingteam") val battingTeam: String,
    @SerializedName("Total") val total: String,
    @SerializedName("Wickets") val wickets: String,
    @SerializedName("Overs") val overs: String,
    @SerializedName("Runrate") val runrate: String,
    @SerializedName("Byes") val byes: String,
    @SerializedName("Legbyes") val legbyes: String,
    @SerializedName("Wides") val wides: String,
    @SerializedName("Noballs") val noballs: String,
    @SerializedName("Penalty") val penalty: String,
    @SerializedName("AllottedOvers") val allottedOvers: String,
    @SerializedName("Target") val target: String?,  // Target is nullable as it's only in the second inning
    @SerializedName("Batsmen") val batsmen: List<Batsman>,
    @SerializedName("Partnership_Current") val partnershipCurrent: PartnershipCurrent,
    @SerializedName("Bowlers") val bowlers: List<Bowler>,
    @SerializedName("FallofWickets") val fallOfWickets: List<FallOfWicket>,
    @SerializedName("PowerPlay") val powerPlay: PowerPlay
)

data class Batsman(
    @SerializedName("Batsman") val batsman: String,
    @SerializedName("Runs") val runs: String,
    @SerializedName("Balls") val balls: String,
    @SerializedName("Fours") val fours: String,
    @SerializedName("Sixes") val sixes: String,
    @SerializedName("Dots") val dots: String,
    @SerializedName("Strikerate") val strikerate: String,
    @SerializedName("Dismissal") val dismissal: String,
    @SerializedName("Howout") val howout: String,
    @SerializedName("Bowler") val bowler: String?, // Bowler can be empty
    @SerializedName("Fielder") val fielder: String?, // Fielder can be empty
    @SerializedName("Isonstrike") val isOnStrike: Boolean? // Only present for current batsmen
)


data class PartnershipCurrent(
    @SerializedName("Runs") val runs: String,
    @SerializedName("Balls") val balls: String,
    @SerializedName("Batsmen") val batsmen: List<PartnershipBatsman>
)

data class PartnershipBatsman(
    @SerializedName("Batsman") val batsman: String,
    @SerializedName("Runs") val runs: String,
    @SerializedName("Balls") val balls: String
)


data class Bowler(
    @SerializedName("Bowler") val bowler: String,
    @SerializedName("Overs") val overs: String,
    @SerializedName("Maidens") val maidens: String,
    @SerializedName("Runs") val runs: String,
    @SerializedName("Wickets") val wickets: String,
    @SerializedName("Economyrate") val economyRate: String,
    @SerializedName("Noballs") val noballs: String,
    @SerializedName("Wides") val wides: String,
    @SerializedName("Dots") val dots: String,
    @SerializedName("Isbowlingtandem") val isBowlingTandem: Boolean?,
    @SerializedName("Isbowlingnow") val isBowlingNow: Boolean?,
    @SerializedName("ThisOver") val thisOver: List<ThisOver>?
)
data class ThisOver(
    @SerializedName("T") val type: String,
    @SerializedName("B") val ball: String
)

data class FallOfWicket(
    @SerializedName("Batsman") val batsman: String,
    @SerializedName("Score") val score: String,
    @SerializedName("Overs") val overs: String
)

data class PowerPlay(
    @SerializedName("PP1") val pp1: String,
    @SerializedName("PP2") val pp2: String
)

data class Teams(
    @SerializedName("6") val team6: Team,
    @SerializedName("7") val team7: Team
)

data class Team(
    @SerializedName("Name_Full") val nameFull: String,
    @SerializedName("Name_Short") val nameShort: String,
    @SerializedName("Players") val players: Map<String, Player> // Use a Map for Players
)


data class Player(
    @SerializedName("Position") val position: String,
    @SerializedName("Name_Full") val nameFull: String,
    @SerializedName("Batting") val batting: Batting,
    @SerializedName("Bowling") val bowling: Bowling,
    @SerializedName("Iscaptain") val isCaptain: Boolean?,
    @SerializedName("Iskeeper") val isKeeper: Boolean?
)

data class Batting(
    @SerializedName("Style") val style: String,
    @SerializedName("Average") val average: String,
    @SerializedName("Strikerate") val strikerate: String,
    @SerializedName("Runs") val runs: String
)

data class Bowling(
    @SerializedName("Style") val style: String,
    @SerializedName("Average") val average: String,
    @SerializedName("Economyrate") val economyRate: String,
    @SerializedName("Wickets") val wickets: String
)

data class Notes(
    @SerializedName("1") val note1: List<String>,
    @SerializedName("2") val note2: List<String>
)