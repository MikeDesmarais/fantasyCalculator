package com.mikedesmarais.fantasycalculator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    private long count = 0;
    private File file;
    private BufferedWriter out;
    private List<Team> startingTeams = new ArrayList<Team>();

    public List<Team> getStartingTeams() {
        return startingTeams;
    }

    public void run() {
        file = new File("fantasyCalculatorOut.txt");

        try {
            out = new BufferedWriter(new FileWriter(file));
        } catch (IOException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        populateRoster(new Roster(), startingTeams);

        try {
            out.flush();
            out.close();
        } catch (IOException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void setStartingTeams(List<Team> startingTeams) {
        this.startingTeams = startingTeams;
    }

    private void populateRoster(Roster roster, List<Team> teams) {

        if ((teams == null) || (teams.size() == 0)) {

            try {
                out.write(roster.toString());
                out.write("\n");
            } catch (IOException e) {

                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            count++;

            if ((count % 10000) == 0) {
                System.out.println(count);

                try {
                    out.flush();
                } catch (IOException e) {

                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

            return;
        }

        Team currentTeam = teams.remove(0);

        for (Player currentPlayer : currentTeam.getPlayers()) {

            if (roster.isPositionAvailable(currentPlayer.getPosition())) {
                roster.addPlayer(currentPlayer);
                populateRoster(roster, teams);

                //After we get back from a recursive call we need to remove the player we just added because we're modifying instead of making copies
                roster.removePlayer(currentPlayer);
            }
        }

        //Add team back in.  We're modifying the list of teams as we go instead of making copies.
        teams.add(0, currentTeam);
    }
}
