package com.mycompany.hello;
// Define the interface
interface Payment {
    void pay(double amount);
}

// Implement the interface for CreditCardPayment
class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

// Implement the interface for PayPalPayment
class PayPalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}

public class PaymentInterfaceExample {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment();
        Payment paypal = new PayPalPayment();

        creditCard.pay(100.50);
        paypal.pay(200.75);
    }
}
