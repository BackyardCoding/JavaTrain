package de.dumbuya;
// A generic class to implement a league table for a sport.
// The class should allow teams to be added to the list, and store
// a list of teams that belong to the league.
//
// The class has a method to print out the teams in order,
// with the team at the top of the league printed first.
//
// Only teams of the same type should are added to any particular
// instance of the league class - the program fails to compile
// if an attempt is made to add an incompatible team.
public class Main {

    public static void main(String[] args) {
        //Top Bundesliga Teams
        Team<SoccerPlayer> bayern = new Team<>("Bayern Munich");
        Team<SoccerPlayer> dortmund = new Team<>("Borussia Dortmund");
        Team<SoccerPlayer> rbLeipzig = new Team<>("RB Leipzig");
        Team<SoccerPlayer> bayerLeverkusen = new Team<>("Bayer 04 Leverkusen");

        //Favorite NBA teams
        Team<BasketballPlayer> chicagoBulls = new Team<>("Chicago Bulls");
        Team<BasketballPlayer> bostonCeltics = new Team<>("Boston Celtics");
        Team<BasketballPlayer> goldenStateWarriors = new Team<>("Golden State Warriors");
        Team<BasketballPlayer> losAngelesLakers = new Team<>("Los Angeles Lakers");

        //Favorite Football Teams
        Team<FootballPlayer> newEnglandPatriots = new Team<>("New England Patriots");
        Team<FootballPlayer> denverBroncos = new Team<>("Denver Broncos");
        Team<FootballPlayer> newYorkGiants = new Team<>("New York Giants");
        Team<FootballPlayer> atlantaFalcons = new Team<>("Atlanta Falcons");

        LeagueTable<Team<SoccerPlayer>> bundesliga = new LeagueTable("Bundesliga");
        LeagueTable<Team<FootballPlayer>> nfl = new LeagueTable<>("NFL");
        LeagueTable<Team<BasketballPlayer>> nba = new LeagueTable<>("NBA");

        //add results basketball
        bayern.matchResult(dortmund,3,2);
        rbLeipzig.matchResult(bayerLeverkusen,1,1);

        //add results football
        newEnglandPatriots.matchResult(denverBroncos,24,7);
        newYorkGiants.matchResult(atlantaFalcons,25,26);

        //add results football
        chicagoBulls.matchResult(goldenStateWarriors,103,101);
        losAngelesLakers.matchResult(bostonCeltics,83,83);

        //add Teams bundesliga
        bundesliga.addTeam(bayern);
        bundesliga.addTeam(dortmund);
        bundesliga.addTeam(rbLeipzig);
        bundesliga.addTeam(bayerLeverkusen);

        //add NFL teams
        nfl.addTeam(newEnglandPatriots);
        nfl.addTeam(denverBroncos);
        nfl.addTeam(newYorkGiants);
        nfl.addTeam(atlantaFalcons);

        //add nba teams
        nba.addTeam(chicagoBulls);
        nba.addTeam(goldenStateWarriors);
        nba.addTeam(losAngelesLakers);
        nba.addTeam(bostonCeltics);

        //Print league tables
        bundesliga.printTeamsOrdered();
        nfl.printTeamsOrdered();
        nba.printTeamsOrdered();
    }
}
