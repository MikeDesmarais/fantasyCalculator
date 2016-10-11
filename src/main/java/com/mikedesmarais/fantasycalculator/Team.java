package com.mikedesmarais.fantasycalculator;

import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public String getName() {
        return name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
