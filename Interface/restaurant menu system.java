// MenuItem interface
interface MenuItem {
    void prepare();
    double getPrice();
}

// Pizza class
class Pizza implements MenuItem {
    private double price = 8.50;

    @Override
    public void prepare() {
        System.out.println("Preparing pizza...");
    }

    @Override
    public double getPrice() {
        return price;
    }
}

// Pasta class
class Pasta implements MenuItem {
    private double price = 7.30;

    @Override
    public void prepare() {
        System.out.println("Preparing pasta...");
    }

    @Override
    public double getPrice() {
        return price;
    }
}

// Burger class
class Burger implements MenuItem {
    private double price = 5.20;

    @Override
    public void prepare() {
        System.out.println("Preparing burger...");
    }

    @Override
    public double getPrice() {
        return price;
    }
}

// Main class
public class RestaurantMenuSystem {
    public static void main(String[] args) {
        MenuItem pizza = new Pizza();
        MenuItem pasta = new Pasta();
        MenuItem burger = new Burger();

        // Prepare items
        pizza.prepare();
        pasta.prepare();
        burger.prepare();

        // Calculate total bill
        double total = pizza.getPrice() + pasta.getPrice() + burger.getPrice();
        System.out.println("Total bill: $" + total);
    }
}
