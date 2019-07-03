package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.HashMap;

public class FlightFinder {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> possibleFlights = new HashMap<>();
        possibleFlights.put("WAW", true);
        possibleFlights.put("KRK", true);
        possibleFlights.put("GDA", false);

        if(flight.getArrivalAirport() != "GDA") {
            System.out.println("Flight to airport " + flight.getArrivalAirport() + " is available.");
        } else {
            throw new RouteNotFoundException("Flight to airport " + flight.getArrivalAirport() + " is not available.");
        }


    }

    public static void main(String[] args) {
        Flight flightOne = new Flight("JFK","WAW");
        Flight flightTwo = new Flight("JFK", "GDA");
        Flight flightThree = new Flight("JFK", "KRK");
        FlightFinder finder = new FlightFinder();

        ArrayList<Flight> flights = new ArrayList<>();
        flights.add(flightOne);
        flights.add(flightTwo);
        flights.add(flightThree);

        for(Flight flight: flights) {
            try {
                finder.findFlight(flight);
            } catch (RouteNotFoundException e) {
                System.out.println("ERROR -->   " + e);
            }
        }
    }
}
