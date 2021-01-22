package de.dumbuya;

import java.util.*;

public class LeagueTable<T extends Team> {
    private String name;
    private ArrayList<T> teams = new ArrayList<>();

    public LeagueTable(String name) {
        this.name = name;
    }

    public boolean addTeam(T team) {
        if (this.teams.contains(team)) {
            System.out.println(team.getName() + " is already in the League");
            return false;
        }
        this.teams.add(team);
        return true;
    }

    public void printTeamsOrdered() {
        Collections.sort(this.teams);
        System.out.println("Teams in the " + getName());
        for (T i : teams) {
            System.out.println(i.getName() + ": " + i.ranking());
        }
    }

    public String getName() {
        return name;
    }
}
