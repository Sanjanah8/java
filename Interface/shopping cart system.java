interface CartItem {
    void addItem();
    void removeItem();
    double calculateTotal();
}

class Electronics implements CartItem {
    private double price = 200.0;

    @Override
    public void addItem() {
        System.out.println("Electronics item added.");
    }

    @Override
    public void removeItem() {
        System.out.println("Electronics item removed.");
    }

    @Override
    public double calculateTotal() {
        return price;
    }
}

class Groceries implements CartItem {
    private double price = 50.0;

    @Override
    public void addItem() {
        System.out.println("Groceries item added.");
    }

    @Override
    public void removeItem() {
        System.out.println("Groceries item removed.");
    }

    @Override
    public double calculateTotal() {
        return price;
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        CartItem electronics = new Electronics();
        electronics.addItem();
        System.out.println("Electronics total: $" + electronics.calculateTotal());
        electronics.removeItem();

        CartItem groceries = new Groceries();
        groceries.addItem();
        System.out.println("Groceries total: $" + groceries.calculateTotal());
        groceries.removeItem();
    }
}
