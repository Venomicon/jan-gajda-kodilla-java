package com.kodilla.good.patterns.challenge2;

import java.util.Objects;

public class Flight {
    private int flightNumber;
    private String departureAirport;
    private String arrivalAirport;

    public Flight(int flightNumber, String departureAirport, String arrivalAirport) {
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightNumber);
    }

    @Override
    public String toString() {
        return "{ Flight #" + flightNumber + ": " + departureAirport + " ---> " + arrivalAirport + " }";
    }
}
