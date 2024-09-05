// Discount interface
interface Discount {
    double applyDiscount(double price);
}

// SeasonalDiscount class
class SeasonalDiscount implements Discount {
    private double discountRate = 0.20; // 20% discount

    @Override
    public double applyDiscount(double price) {
        return price - (price * discountRate);
    }
}

// LoyaltyDiscount class
class LoyaltyDiscount implements Discount {
    private double discountRate = 0.10; // 10% loyalty discount

    @Override
    public double applyDiscount(double price) {
        return price - (price * discountRate);
    }
}

// PromoCodeDiscount class
class PromoCodeDiscount implements Discount {
    private double discountAmount = 50.0; // $50 promo code discount

    @Override
    public double applyDiscount(double price) {
        return price - discountAmount;
    }
}

// Main class
public class ECommerceDiscountSystem {
    public static void main(String[] args) {
        Discount seasonal = new SeasonalDiscount();
        Discount loyalty = new LoyaltyDiscount();
        Discount promoCode = new PromoCodeDiscount();

        double originalPrice = 200.0;

        System.out.println("Original Price: $" + originalPrice);
        System.out.println("Price after Seasonal Discount: $" + seasonal.applyDiscount(originalPrice));
        System.out.println("Price after Loyalty Discount: $" + loyalty.applyDiscount(originalPrice));
        System.out.println("Price after Promo Code Discount: $" + promoCode.applyDiscount(originalPrice));
    }
}
