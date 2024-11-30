package org.example;

import java.sql.*;
import java.time.LocalDateTime;

public class FlightDAO {

    public void addFlight(String flightNumber, String destination, LocalDateTime departureDate, double price) {
        String sql = "INSERT INTO Flights (flight_number, destination, departure_date, price) VALUES (?, ?, ?, ?)";
        try (Connection conn = AviacompanyDatabase.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, flightNumber);
            pstmt.setString(2, destination);
            pstmt.setObject(3, departureDate); // Используем setObject для LocalDateTime
            pstmt.setDouble(4, price);
            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Flight added successfully.");
            } else {
                System.out.println("Error adding flight.");
            }
        } catch (SQLException e) {
            System.out.println("Error adding flight: " + e.getMessage());
        }
    }

    public void getFlightById(int flightId) {
        String sql = "SELECT * FROM Flights WHERE id = ?";
        try (Connection conn = AviacompanyDatabase.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, flightId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                System.out.println("Flight found:");
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Flight Number: " + rs.getString("flight_number"));
                System.out.println("Destination: " + rs.getString("destination"));
                System.out.println("Departure Date: " + rs.getTimestamp("departure_date"));
                System.out.println("Price: " + rs.getDouble("price"));
            } else {
                System.out.println("Flight with ID " + flightId + " not found.");
            }
        } catch (SQLException e) {
            System.out.println("Error retrieving flight: " + e.getMessage());
        }
    }

    public void updateFlightPrice(int flightId, double newPrice) {
        String sql = "UPDATE Flights SET price = ? WHERE id = ?";
        try (Connection conn = AviacompanyDatabase.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setDouble(1, newPrice);
            pstmt.setInt(2, flightId);
            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Flight price updated successfully.");
            } else {
                System.out.println("Flight with ID " + flightId + " not found.");
            }
        } catch (SQLException e) {
            System.out.println("Error updating flight price: " + e.getMessage());
        }
    }

    public void deleteFlight(int flightId) {
        String sql = "DELETE FROM Flights WHERE id = ?";
        try (Connection conn = AviacompanyDatabase.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, flightId);
            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Flight deleted successfully.");
            } else {
                System.out.println("Flight with ID " + flightId + " not found.");
            }
        } catch (SQLException e) {
            System.out.println("Error deleting flight: " + e.getMessage());
        }
    }
}


