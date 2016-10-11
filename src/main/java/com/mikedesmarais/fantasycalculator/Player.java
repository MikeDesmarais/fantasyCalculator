package com.mikedesmarais.fantasycalculator;

public class Player {
    private String name;
    private Position position;
    private double totalScore;
    private double week1;
    private double week2;
    private double week3;
    private double week4;

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public double getTotalScore() {
        return totalScore;
    }

    public double getWeek1() {
        return week1;
    }

    public double getWeek2() {
        return week2;
    }

    public double getWeek3() {
        return week3;
    }

    public double getWeek4() {
        return week4;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setTotalScore(double totalScore) {
        this.totalScore = totalScore;
    }

    public void setWeek1(double week1) {
        this.week1 = week1;
    }

    public void setWeek2(double week2) {
        this.week2 = week2;
    }

    public void setWeek3(double week3) {
        this.week3 = week3;
    }

    public void setWeek4(double week4) {
        this.week4 = week4;
    }
}
