package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> possibleFlights = new HashMap<>();
        possibleFlights.put("KRK", true);
        possibleFlights.put("GDA", true);
        possibleFlights.put("WAW", false);

        for (Map.Entry<String, Boolean> entry : possibleFlights.entrySet()) {
            if (entry.getKey().equals(flight.getArrivalAirport())) {
                if (entry.getValue()) {
                    System.out.println("Flight to airport " + entry.getKey() + " is available.");
                } else {
                    throw new RouteNotFoundException("Flight to airport " + entry.getKey() + " is unavailable.");
                }
            }
        }
    }

    public static void main(String[] args) {
        Flight flightOne = new Flight("JFK", "WAW");
        FlightFinder finder = new FlightFinder();

        try {
            finder.findFlight(flightOne);
        } catch (RouteNotFoundException e) {
            System.out.println("ERROR -->   " + e);
        }
    }
}
