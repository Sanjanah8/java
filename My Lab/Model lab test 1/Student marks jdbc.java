//sql

CREATE TABLE students (
    student_id INT PRIMARY KEY,
    student_name VARCHAR(255),
    fee DECIMAL(10, 2),
    mark1 INT,
    mark2 INT,
    mark3 INT,
    total INT,
    average DECIMAL(5, 2),
    grade CHAR(1)
);

//program

import java.sql.*;
import java.util.Scanner;

public class StudentMarksList {
    private static final String URL = "jdbc:mysql://localhost:3306/school";
    private static final String USER = "root";
    private static final String PASSWORD = "your_password"; // Replace with your MySQL password

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            // Example usage of methods
            removeStudentsWithGradeD(conn);
            displayStudentsWithHighScores(conn);
            provideFeeDiscount(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to remove students with grade 'D'
    public static void removeStudentsWithGradeD(Connection conn) throws SQLException {
        String query = "DELETE FROM students WHERE grade = 'D'";
        try (Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(query);
            System.out.println("Removed " + rowsAffected + " students with grade 'D'.");
        }
    }

    // Method to display students who scored more than 250 in total
    public static void displayStudentsWithHighScores(Connection conn) throws SQLException {
        String query = "SELECT student_id, student_name, total FROM students WHERE total > 250";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            System.out.println("Students with a total score greater than 250:");
            while (rs.next()) {
                int studentId = rs.getInt("student_id");
                String studentName = rs.getString("student_name");
                int total = rs.getInt("total");
                System.out.println("Student ID: " + studentId + ", Name: " + studentName + ", Total: " + total);
            }
        }
    }

    // Method to provide a 5% discount on the fee for students who scored higher marks
    public static void provideFeeDiscount(Connection conn) throws SQLException {
        String query = "UPDATE students SET fee = fee * 0.95 WHERE total > 250";
        try (Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(query);
            System.out.println("Provided 5% discount on the fee for " + rowsAffected + " students with total marks greater than 250.");
        }
    }
}
