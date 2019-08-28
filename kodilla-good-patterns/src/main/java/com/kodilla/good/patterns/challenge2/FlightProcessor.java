package com.kodilla.good.patterns.challenge2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightProcessor {
    private ArrayList<Flight> flights;

    public FlightProcessor(ArrayList<Flight> flights) {
        this.flights = flights;
    }

    public void showAllFlights() {
        System.out.println("Available flights: ");
        flights.forEach(System.out::println);
    }

    public void showAllDepartures(Airport airport) {
        System.out.println("Available flights departing from " + airport.getName() + ":");
        flights.stream()
                .filter(e -> e.getDepartureAirport().equals(airport.getName()))
                .forEach(System.out::println);
    }

    public void showAllArrivals(Airport airport) {
        System.out.println("Available flights arriving at " + airport.getName() + ":");
        flights.stream()
                .filter(e -> e.getArrivalAirport().equals(airport.getName()))
                .forEach(System.out::println);
    }

    public void findFlightThru(Airport departure, Airport arrival, Airport transfer) {
        System.out.println("Available flights departing from " + departure + " through " + transfer + " arriving at " + arrival + ":");
        List<Flight> transfer1 = flights.stream()
                .filter(e -> e.getDepartureAirport().equals(departure.getName()))
                .filter(e -> e.getArrivalAirport().equals(transfer.getName()))
                .collect(Collectors.toList());
        List<Flight> transfer2 = flights.stream()
                .filter(e -> e.getDepartureAirport().equals(transfer.getName()))
                .filter(e -> e.getArrivalAirport().equals(arrival.getName()))
                .collect(Collectors.toList());
        for (Flight flight1: transfer1) {
            for(Flight flight2: transfer2) {
                if(flight1.getArrivalAirport().equals(flight2.getDepartureAirport())) {
                    System.out.println(flight1 + " with transfer: " + flight2);
                }
            }
        }
    }
}
