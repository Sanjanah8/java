import java.sql.*;

public class LibraryManagement {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/library";
        String user = "root";
        String password = "password";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {
            // Insert a new book
            String insertQuery = "INSERT INTO books (book_id, title, author) VALUES (1, 'Effective Java', 'Joshua Bloch')";
            stmt.executeUpdate(insertQuery);

            // Retrieve and display all books
            String selectQuery = "SELECT * FROM books";
            ResultSet rs = stmt.executeQuery(selectQuery);
            while (rs.next()) {
                System.out.println("Book ID: " + rs.getInt("book_id") +
                                   ", Title: " + rs.getString("title") +
                                   ", Author: " + rs.getString("author"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
