//sql database

CREATE TABLE loans (
    loan_id INT PRIMARY KEY,
    customer_name VARCHAR(255),
    customer_id INT,
    loan_amount DECIMAL(10, 2),
    loan_type VARCHAR(50),
    interest_rate DECIMAL(5, 2),
    loan_tenure INT,
    application_date DATE,
    monthly_installment DECIMAL(10, 2)
);


//PROGRAM


import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoanManagementSystem {
    private static final String URL = "jdbc:mysql://localhost:3306/loan_management";
    private static final String USER = "root";
    private static final String PASSWORD = "your_password"; // Replace with your MySQL password

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            // Example usage of methods
            updateLoanApplication(conn, 1, "John Doe", 12345, 15000.00, "Personal", 5.5, 3, new Date());
            removeIneligibleLoans(conn);
            calculateAndStoreMonthlyInstallments(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to update an existing loan application
    public static void updateLoanApplication(Connection conn, int loanId, String customerName, int customerId,
                                              double loanAmount, String loanType, double interestRate, int loanTenure,
                                              Date applicationDate) throws SQLException {
        String query = "UPDATE loans SET customer_name = ?, customer_id = ?, loan_amount = ?, loan_type = ?, " +
                       "interest_rate = ?, loan_tenure = ?, application_date = ? WHERE loan_id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, customerName);
            pstmt.setInt(2, customerId);
            pstmt.setDouble(3, loanAmount);
            pstmt.setString(4, loanType);
            pstmt.setDouble(5, interestRate);
            pstmt.setInt(6, loanTenure);
            pstmt.setDate(7, new java.sql.Date(applicationDate.getTime()));
            pstmt.setInt(8, loanId);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Loan application updated successfully.");
            } else {
                System.out.println("No loan found with the given ID.");
            }
        }
    }

    // Method to remove ineligible loan applications
    public static void removeIneligibleLoans(Connection conn) throws SQLException {
        String query = "DELETE FROM loans WHERE loan_amount < 5000";
        try (Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(query);
            System.out.println("Removed " + rowsAffected + " ineligible loan applications.");
        }
    }

    // Method to calculate and store the monthly installment amount
    public static void calculateAndStoreMonthlyInstallments(Connection conn) throws SQLException {
        String query = "SELECT loan_id, loan_amount, interest_rate, loan_tenure FROM loans";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                int loanId = rs.getInt("loan_id");
                double loanAmount = rs.getDouble("loan_amount");
                double interestRate = rs.getDouble("interest_rate") / 100 / 12; // Monthly interest rate
                int loanTenure = rs.getInt("loan_tenure") * 12; // Total number of months

                double monthlyInstallment = (loanAmount * interestRate) / (1 - Math.pow(1 + interestRate, -loanTenure));

                String updateQuery = "UPDATE loans SET monthly_installment = ? WHERE loan_id = ?";
                try (PreparedStatement pstmt = conn.prepareStatement(updateQuery)) {
                    pstmt.setDouble(1, monthlyInstallment);
                    pstmt.setInt(2, loanId);
                    pstmt.executeUpdate();
                }
            }
        }
    }
}
