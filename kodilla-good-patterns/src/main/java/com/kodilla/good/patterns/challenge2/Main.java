package com.kodilla.good.patterns.challenge2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Flight flight1 = new Flight(101, "KRK", "WAW");
        Flight flight2 = new Flight(102, "KRK", "RZE");
        Flight flight3 = new Flight(103, "WAW", "GDA");
        Flight flight4 = new Flight(104, "GDA", "WAW");
        Flight flight5 = new Flight(105, "GDA", "RZE");
        Flight flight6 = new Flight(106, "WAW", "WAW");  //incorrect
        Flight flight7 = new Flight(107, "KRK", "WAW");
        Flight flight8 = new Flight(108, "WRO", "WAW");
        Flight flight9 = new Flight(109, "GDA", "WRO");
        Flight flight10 = new Flight(110, "WRO", "KRK");
        Flight flight11 = new Flight(111, "POZ", "WAW");
        Flight flight12 = new Flight(112, "KRK", "POZ");
        Flight flight13 = new Flight(113, "POZ", "GDA");
        Flight flight14 = new Flight(114, "POZ", "GDA");

        Airport krk = new Airport("KRK");
        Airport waw = new Airport("WAW");
        Airport gda = new Airport("GDA");
        Airport poz = new Airport("POZ");
        Airport wro = new Airport("WRO");

        ArrayList<Flight> flights = new ArrayList<>();
        FlightsList flightsList = new FlightsList(flights);
        flightsList.addFlight(flight1);
        flightsList.addFlight(flight2);
        flightsList.addFlight(flight3);
        flightsList.addFlight(flight4);
        flightsList.addFlight(flight5);
        flightsList.addFlight(flight6);
        flightsList.addFlight(flight7);
        flightsList.addFlight(flight8);
        flightsList.addFlight(flight9);
        flightsList.addFlight(flight10);
        flightsList.addFlight(flight11);
        flightsList.addFlight(flight12);
        flightsList.addFlight(flight13);
        flightsList.addFlight(flight14);

        FlightProcessor flightProcessor = new FlightProcessor(flights);
        flightProcessor.showAllDepartures(krk);
        flightProcessor.showAllArrivals(krk);
        flightProcessor.showAllFlights();
        flightProcessor.findFlightThru(krk, gda, poz);
    }
}
