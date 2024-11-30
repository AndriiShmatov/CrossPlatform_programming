package org.example;

import java.time.LocalDateTime;

public class AviacompanyApp {
    public static void main(String[] args) {
        FlightDAO flightDAO = new FlightDAO();

        flightDAO.addFlight("AB125", "Mexico", LocalDateTime.of(2023, 12, 1, 10, 30), 500);

        flightDAO.getFlightById(1);

        flightDAO.updateFlightPrice(1, 5500);

        flightDAO.deleteFlight(1);
    }
}

