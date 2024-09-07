import java.sql.*;

public class EmployeePaySlip {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/employees";
        String user = "root";
        String password = "password";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {
            
            // Insert employee
            String insertQuery = "INSERT INTO employees (name, salary) VALUES ('John Doe', 50000)";
            stmt.executeUpdate(insertQuery);

            // Retrieve all employees
            String selectQuery = "SELECT * FROM employees";
            ResultSet rs = stmt.executeQuery(selectQuery);
            while (rs.next()) {
                System.out.println("Name: " + rs.getString("name") + ", Salary: " + rs.getDouble("salary"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
