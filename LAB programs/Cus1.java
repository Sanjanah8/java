/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week1;

/**
 *
 * @author HP
 */
import java.util.ArrayList;
import java.util.Scanner;

class Customer {
    private String name;
    private String email;
    private ArrayList<Double> purchaseHistory;

    // Constructor to initialize the customer object
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.purchaseHistory = new ArrayList<>();
    }

    // Method to add a purchase to the history
    public void addPurchase(double amount) {
        purchaseHistory.add(amount);
        System.out.println("Purchase added: " + amount);
    }

    // Method to calculate total expenditure
    public double calculateTotalExpenditure() {
        double total = 0;
        for (double amount : purchaseHistory) {
            total += amount;
        }
        return total;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Double> getPurchaseHistory() {
        return purchaseHistory;
    }
}

class LoyalCustomer extends Customer {
    private double discountRate;

    // Constructor to initialize the loyal customer object
    public LoyalCustomer(String name, String email, double discountRate) {
        super(name, email);
        this.discountRate = discountRate;
    }

    // Method to apply discount to a purchase
    public void addPurchaseWithDiscount(double amount) {
        double discountedAmount = amount - (amount * discountRate / 100);
        super.addPurchase(discountedAmount);
        System.out.println("Discount applied: " + discountRate + "%");
    }

    // Getter for discount rate
    public double getDiscountRate() {
        return discountRate;
    }
}

public class Cus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();

        System.out.print("Enter customer email: ");
        String email = scanner.nextLine();

        System.out.print("Is the customer a loyal customer? (yes/no): ");
        String isLoyal = scanner.nextLine();

        Customer customer;
        if (isLoyal.equalsIgnoreCase("yes")) {
            System.out.print("Enter discount rate: ");
            double discountRate = scanner.nextDouble();
            customer = new LoyalCustomer(name, email, discountRate);
        } else {
            customer = new Customer(name, email);
        }

        while (true) {
            System.out.print("Enter purchase amount (or type 'exit' to finish): ");
            String input = scanner.next();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            double amount = Double.parseDouble(input);
            if (customer instanceof LoyalCustomer) {
                ((LoyalCustomer) customer).addPurchaseWithDiscount(amount);
            } else {
                customer.addPurchase(amount);
            }
        }

        System.out.println("Total expenditure for " + customer.getName() + ": " + customer.calculateTotalExpenditure());
        scanner.close();
    }
}

