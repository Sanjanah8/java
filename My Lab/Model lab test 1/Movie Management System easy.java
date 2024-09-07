import java.sql.*;

public class MovieManagement {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/movies";
        String user = "root";
        String password = "password";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {
            
            // Insert a movie
            String insertQuery = "INSERT INTO movies (title, genre) VALUES ('Inception', 'Sci-Fi')";
            stmt.executeUpdate(insertQuery);

            // Display all movies
            String selectQuery = "SELECT * FROM movies";
            ResultSet rs = stmt.executeQuery(selectQuery);
            while (rs.next()) {
                System.out.println("Title: " + rs.getString("title") + ", Genre: " + rs.getString("genre"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
