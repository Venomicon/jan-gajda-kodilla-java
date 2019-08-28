package com.kodilla.good.patterns.challenge2;

import java.util.ArrayList;

public class FlightsList {
    private ArrayList<Flight> flights = new ArrayList<>();

    public FlightsList(ArrayList<Flight> flights) {
        this.flights = flights;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public void addFlight(Flight flight) {
        if (flights.contains(flight)) {
            System.out.println(flight + " is already listed.");
        } else if(flight.getArrivalAirport().equals(flight.getDepartureAirport())) {
            System.out.println("Incorrect airport values.");
        } else {
            flights.add(flight);
        }
    }
}
