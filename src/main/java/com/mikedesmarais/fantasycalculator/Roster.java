package com.mikedesmarais.fantasycalculator;

import java.util.ArrayList;
import java.util.List;

public class Roster {
    public static final int NUMBER_OF_QB = 2;
    public static final int NUMBER_OF_RB = 3;
    public static final int NUMBER_OF_WR = 4;
    public static final int NUMBER_OF_TE = 1;
    public static final int NUMBER_OF_K = 1;
    public static final int NUMBER_OF_DEF = 1;
    private List<Player> defs = new ArrayList<Player>();
    private List<Player> ks = new ArrayList<Player>();
    private List<Player> qbs = new ArrayList<Player>();
    private List<Player> rbs = new ArrayList<Player>();
    private List<Player> tes = new ArrayList<Player>();
    private List<Player> wrs = new ArrayList<Player>();

    public void addPlayer(Player player) {

        switch (player.getPosition()) {

            case DEF: {
                defs.add(player);

                break;
            }

            case K: {
                ks.add(player);

                break;
            }

            case QB: {
                qbs.add(player);

                break;
            }

            case RB: {
                rbs.add(player);

                break;
            }

            case TE: {
                tes.add(player);

                break;
            }

            case WR: {
                wrs.add(player);

                break;
            }

            default: {
                break;
            }
        }
    }

    public boolean isPositionAvailable(Position position) {

        switch (position) {

            case DEF: {

                if (defs.size() < NUMBER_OF_DEF) {
                    return true;
                }

                break;
            }

            case K: {

                if (ks.size() < NUMBER_OF_K) {
                    return true;
                }

                break;
            }

            case QB: {

                if (qbs.size() < NUMBER_OF_QB) {
                    return true;
                }

                break;
            }

            case RB: {

                if (rbs.size() < NUMBER_OF_RB) {
                    return true;
                }

                break;
            }

            case TE: {

                if (tes.size() < NUMBER_OF_TE) {
                    return true;
                }

                break;
            }

            case WR: {

                if (wrs.size() < NUMBER_OF_WR) {
                    return true;
                }

                break;
            }

            default: {
                break;
            }
        }

        return false;
    }

    public void removePlayer(Player player) {

        switch (player.getPosition()) {

            case DEF: {
                defs.remove(player);

                break;
            }

            case K: {
                ks.remove(player);

                break;
            }

            case QB: {
                qbs.remove(player);

                break;
            }

            case RB: {
                rbs.remove(player);

                break;
            }

            case TE: {
                tes.remove(player);

                break;
            }

            case WR: {
                wrs.remove(player);

                break;
            }

            default: {
                break;
            }
        }
    }

    @Override
    public String toString() {
        double totalScore = 0;
        StringBuilder sb = new StringBuilder();

        for (Player qb : qbs) {
            sb.append("QB: ");
            sb.append(qb.getName());
            sb.append(" (");
            sb.append(qb.getTotalScore());
            sb.append(") ");
            totalScore += qb.getTotalScore();
        }

        for (Player rb : rbs) {
            sb.append("RB: ");
            sb.append(rb.getName());
            sb.append(" (");
            sb.append(rb.getTotalScore());
            sb.append(") ");
            totalScore += rb.getTotalScore();
        }

        for (Player wr : wrs) {
            sb.append("WR: ");
            sb.append(wr.getName());
            sb.append(" (");
            sb.append(wr.getTotalScore());
            sb.append(") ");
            totalScore += wr.getTotalScore();
        }

        for (Player te : tes) {
            sb.append("TE: ");
            sb.append(te.getName());
            sb.append(" (");
            sb.append(te.getTotalScore());
            sb.append(") ");
            totalScore += te.getTotalScore();
        }

        for (Player k : ks) {
            sb.append("K: ");
            sb.append(k.getName());
            sb.append(" (");
            sb.append(k.getTotalScore());
            sb.append(") ");
            totalScore += k.getTotalScore();
        }

        for (Player def : defs) {
            sb.append("DEF: ");
            sb.append(def.getName());
            sb.append(" (");
            sb.append(def.getTotalScore());
            sb.append(") ");
            totalScore += def.getTotalScore();
        }

        sb.append("Total Score ~ ");
        sb.append(totalScore);

        return sb.toString();
    }
}
