import java.sql.*;

public class EmployeeManagement {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/employees";
        String user = "root";
        String password = "password";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {
            
            // Insert an employee
            String insertQuery = "INSERT INTO employee (name, designation, salary) VALUES ('Alice', 'Manager', 70000)";
            stmt.executeUpdate(insertQuery);

            // Retrieve and display all employees
            String selectQuery = "SELECT * FROM employee";
            ResultSet rs = stmt.executeQuery(selectQuery);
            while (rs.next()) {
                System.out.println("Name: " + rs.getString("name") + ", Designation: " + rs.getString("designation") + ", Salary: " + rs.getDouble("salary"));
            }

            // Update employee details
            String updateQuery = "UPDATE employee SET salary = 75000 WHERE name = 'Alice'";
            stmt.executeUpdate(updateQuery);

            // Delete an employee
            String deleteQuery = "DELETE FROM employee WHERE name = 'Alice'";
            stmt.executeUpdate(deleteQuery);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
