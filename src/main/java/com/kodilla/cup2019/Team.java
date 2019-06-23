package com.kodilla.cup2019;

public class Team {
    String name;
    int pts;
    int scored;
    int conceded;

    public Team(String name, int pts, int scored, int conceded) {
        this.name = name;
        this.pts = pts;
        this.scored = scored;
        this.conceded = conceded;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", pts=" + pts +
                ", scored=" + scored +
                ", conceded=" + conceded +
                '}';
    }
}
