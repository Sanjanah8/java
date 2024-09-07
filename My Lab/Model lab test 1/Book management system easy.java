import java.sql.*;

public class BookManagement {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/library";
        String user = "root";
        String password = "password";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            // Insert a new book
            String insertQuery = "INSERT INTO books (title, author, price) VALUES ('The Alchemist', 'Paulo Coelho', 500)";
            stmt.executeUpdate(insertQuery);

            // Retrieve all books
            String selectQuery = "SELECT * FROM books";
            ResultSet rs = stmt.executeQuery(selectQuery);
            while (rs.next()) {
                System.out.println("Title: " + rs.getString("title") + ", Author: " + rs.getString("author") + ", Price: " + rs.getDouble("price"));
            }

            // Update book price
            String updateQuery = "UPDATE books SET price = 550 WHERE title = 'The Alchemist'";
            stmt.executeUpdate(updateQuery);

            // Delete a book
            String deleteQuery = "DELETE FROM books WHERE title = 'The Alchemist'";
            stmt.executeUpdate(deleteQuery);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
