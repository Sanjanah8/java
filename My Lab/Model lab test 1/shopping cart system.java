import java.util.ArrayList;
import java.util.List;

class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class ShoppingCart {
    private List<Item> cart;

    public ShoppingCart() {
        cart = new ArrayList<>();
    }

    public void addItem(Item item) {
        cart.add(item);
        System.out.println(item.getName() + " added to cart.");
    }

    public void removeItem(Item item) {
        cart.remove(item);
        System.out.println(item.getName() + " removed from cart.");
    }

    public void viewCart() {
        System.out.println("Items in cart:");
        for (Item item : cart) {
            System.out.println(item.getName() + ": $" + item.getPrice());
        }
    }

    public double getTotal() {
        double total = 0;
        for (Item item : cart) {
            total += item.getPrice();
        }
        return total;
    }
}

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("Laptop", 1500);
        Item item2 = new Item("Phone", 800);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.viewCart();

        System.out.println("Total price: $" + cart.getTotal());

        cart.removeItem(item2);
        cart.viewCart();
    }
}
