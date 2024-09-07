import java.util.HashMap;
import java.util.Map;

class Restaurant {
    private Map<String, Double> menu;
    private Map<String, Integer> order;

    public Restaurant() {
        menu = new HashMap<>();
        menu.put("Pizza", 250.0);
        menu.put("Burger", 150.0);
        menu.put("Pasta", 200.0);

        order = new HashMap<>();
    }

    public void addItemToOrder(String item) {
        if (menu.containsKey(item)) {
            order.put(item, order.getOrDefault(item, 0) + 1);
            System.out.println(item + " added to the order.");
        } else {
            System.out.println("Item not available on the menu.");
        }
    }

    public double calculateBill() {
        double total = 0;
        for (Map.Entry<String, Integer> entry : order.entrySet()) {
            total += menu.get(entry.getKey()) * entry.getValue();
        }
        return total;
    }

    public void displayOrder() {
        System.out.println("Current order:");
        for (Map.Entry<String, Integer> entry : order.entrySet()) {
            System.out.println(entry.getKey() + " x " + entry.getValue());
        }
        System.out.println("Total bill: " + calculateBill());
    }
}

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.addItemToOrder("Pizza");
        restaurant.addItemToOrder("Burger");
        restaurant.addItemToOrder("Pasta");
        restaurant.displayOrder();
    }
}
