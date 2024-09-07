package com.mycompany.jdbc;

import java.sql.*;
import java.util.Scanner;

public class LibraryManagement {
    private static final String URL = "jdbc:mysql://localhost:3306/library";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Scanner scanner = new Scanner(System.in)) {

            while (true) {
                System.out.println("Library Management System");
                System.out.println("1. Insert Book");
                System.out.println("2. Update Book");
                System.out.println("3. Delete Book");
                System.out.println("4. Search Book");
                System.out.println("5. Show All Books");
                System.out.println("6. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); 

                switch (choice) {
                    case 1:
                        insertBook(conn, scanner);
                        break;
                    case 2:
                        updateBook(conn, scanner);
                        break;
                    case 3:
                        deleteBook(conn, scanner);
                        break;
                    case 4:
                        searchBook(conn, scanner);
                        break;
                    case 5:
                        showAllBooks(conn);
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid option, please try again.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void insertBook(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter Book ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author: ");
        String author = scanner.nextLine();

        String query = "INSERT INTO books (book_id, title, author) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, title);
            pstmt.setString(3, author);
            pstmt.executeUpdate();
            System.out.println("Book inserted successfully.");
        }
    }

    private static void updateBook(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter Book ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter new Book Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter new Author: ");
        String author = scanner.nextLine();

        String query = "UPDATE books SET title = ?, author = ? WHERE book_id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, title);
            pstmt.setString(2, author);
            pstmt.setInt(3, id);
            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Book updated successfully.");
            } else {
                System.out.println("No book found with the given ID.");
            }
        }
    }

    private static void deleteBook(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter Book ID to delete: ");
        int id = scanner.nextInt();

        String query = "DELETE FROM books WHERE book_id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, id);
            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Book deleted successfully.");
            } else {
                System.out.println("No book found with the given ID.");
            }
        }
    }

    private static void searchBook(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter Book ID to search: ");
        int id = scanner.nextInt();

        String query = "SELECT * FROM books WHERE book_id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                System.out.println("Book ID: " + rs.getInt("book_id"));
                System.out.println("Title: " + rs.getString("title"));
                System.out.println("Author: " + rs.getString("author"));
            } else {
                System.out.println("No book found with the given ID.");
            }
        }
    }

    private static void showAllBooks(Connection conn) throws SQLException {
        String query = "SELECT * FROM books";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                System.out.println("Book ID: " + rs.getInt("book_id") +
                                   ", Title: " + rs.getString("title") +
                                   ", Author: " + rs.getString("author"));
            }
        }
    }
}
