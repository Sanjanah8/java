import java.sql.*;

public class HotelManagement {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/hotel";
        String user = "root";
        String password = "password";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            // Insert guest
            String insertQuery = "INSERT INTO guests (guest_id, name) VALUES (1, 'Alice')";
            stmt.executeUpdate(insertQuery);

            // Retrieve all guests
            String selectQuery = "SELECT * FROM guests";
            ResultSet rs = stmt.executeQuery(selectQuery);
            while (rs.next()) {
                System.out.println("Guest ID: " + rs.getInt("guest_id") + ", Name: " + rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
