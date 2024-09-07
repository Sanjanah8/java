import java.sql.*;

public class TicketBookingSystem {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/ticketing";
        String user = "root";
        String password = "password";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            // Book a ticket
            String bookTicket = "INSERT INTO tickets (customer_name, event, seat_number) VALUES ('John Doe', 'Concert', 15)";
            stmt.executeUpdate(bookTicket);

            // Check ticket status
            String checkTicket = "SELECT * FROM tickets WHERE customer_name = 'John Doe'";
            ResultSet rs = stmt.executeQuery(checkTicket);
            while (rs.next()) {
                System.out.println("Customer: " + rs.getString("customer_name") + ", Event: " + rs.getString("event") + ", Seat: " + rs.getInt("seat_number"));
            }

            // Cancel a ticket
            String cancelTicket = "DELETE FROM tickets WHERE customer_name = 'John Doe'";
            stmt.executeUpdate(cancelTicket);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
