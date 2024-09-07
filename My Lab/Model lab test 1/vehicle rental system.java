//sql

CREATE TABLE vehicles (
    vehicle_id INT PRIMARY KEY,
    vehicle_type VARCHAR(255),
    rental_price DECIMAL(10, 2),
    availability BOOLEAN,
    rental_duration INT
);

//program


import java.sql.*;

public class VehicleRentalSystem {
    private static final String URL = "jdbc:mysql://localhost:3306/rental";
    private static final String USER = "root";
    private static final String PASSWORD = "your_password"; // Replace with your MySQL password

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            modifyRentalDuration(conn, 1, 7);
            retrieveAvailableVehicles(conn);
            // Note: You might want to add functionality for providing discounts or other operations.
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void modifyRentalDuration(Connection conn, int vehicleId, int newDuration) throws SQLException {
        String query = "UPDATE vehicles SET rental_duration = ? WHERE vehicle_id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, newDuration);
            pstmt.setInt(2, vehicleId);
            int rowsAffected = pstmt.executeUpdate();
            System.out.println("Updated rental duration for " + rowsAffected + " vehicle(s).");
        }
    }

    public static void retrieveAvailableVehicles(Connection conn) throws SQLException {
        String query = "SELECT * FROM vehicles WHERE availability = TRUE";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            System.out.println("Available vehicles:");
            while (rs.next()) {
                int vehicleId = rs.getInt("vehicle_id");
                String vehicleType = rs.getString("vehicle_type");
                double rentalPrice = rs.getDouble("rental_price");
                int rentalDuration = rs.getInt("rental_duration");
                System.out.println("Vehicle ID: " + vehicleId + ", Type: " + vehicleType + ", Price: " + rentalPrice + ", Duration: " + rentalDuration);
            }
        }
    }
}
