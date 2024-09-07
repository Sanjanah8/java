import java.sql.*;

public class InventoryManagement {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/inventory";
        String user = "root";
        String password = "password";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            // Insert item into inventory
            String insertQuery = "INSERT INTO items (item_name, quantity, price) VALUES ('Laptop', 10, 50000)";
            stmt.executeUpdate(insertQuery);

            // Retrieve all items
            String selectQuery = "SELECT * FROM items";
            ResultSet rs = stmt.executeQuery(selectQuery);
            while (rs.next()) {
                System.out.println("Item Name: " + rs.getString("item_name") + ", Quantity: " + rs.getInt("quantity") + ", Price: " + rs.getDouble("price"));
            }

            // Update quantity
            String updateQuery = "UPDATE items SET quantity = 15 WHERE item_name = 'Laptop'";
            stmt.executeUpdate(updateQuery);

            // Delete item
            String deleteQuery = "DELETE FROM items WHERE item_name = 'Laptop'";
            stmt.executeUpdate(deleteQuery);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
