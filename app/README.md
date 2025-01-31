Overview
This mobile app project demonstrates the use of Jetpack Compose for building a UI that consumes data from two APIs dynamically and displays match details, squads, and team details.

The application consists of two main screens:

Screen 1: Displays match details, including team names, match date-time, and venue details, with navigation to the second screen.
Screen 2: Displays the squads of two teams, with filtering options for team players, highlights for captains and wicketkeepers, and alerts displaying batting and bowling styles when tapping on a player.
Screens
Screen 1:

![image](https://github.com/user-attachments/assets/c2241dda-76e9-4581-b192-b77c2ffb9515)


Team names (e.g., "INDIA vs NEW ZEALAND").
Match date-time and venue details.
Navigation button to redirect to the second screen for team and player information.
Screen 2:

![image](https://github.com/user-attachments/assets/a7db1c30-7610-49de-9fa5-3bb83a92db51)


Displays the squads of both teams with filters to show players from Team A, Team B, or all players.
Captains and wicketkeepers are highlighted (e.g., MS Dhoni (c & wk)).
When tapping a player, an alert is shown with the player’s batting and bowling styles.
API Endpoints
Match and Team Information:
https://demo.sportz.io/nzin01312019187360.json
https://demo.sportz.io/sapk01222019186652.json
Libraries Used
**Jetpack** Compose for building the UI.
**Retrofit** for API communication.
**Hilt/Dagger** for Dependency injection
**Navigation** for View Transaction
Features
Match Details:
Display match details like team names, venue, and date-time on Screen 1.
Squad Display:
Display the list of players for each team with a filtering option to show all players or specific team players.
Player Details:
Highlight the captain and wicketkeeper in the squad.
On tapping a player, show an alert with the player's batting and bowling styles.