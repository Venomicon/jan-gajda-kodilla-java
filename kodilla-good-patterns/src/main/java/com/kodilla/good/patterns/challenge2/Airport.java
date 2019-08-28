package com.kodilla.good.patterns.challenge2;

public class Airport {
    private String name;

    public Airport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
