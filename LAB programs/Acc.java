/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week1;

/**
 *
 * @author HP
 */
import java.util.Scanner;

abstract class Account {
    private String accountNumber;
    private double balance;

    // Constructor to initialize the account
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getters and setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends Account {
    private static final double INTEREST_RATE = 0.04;

    // Constructor to initialize the savings account
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    // Method to calculate and add interest
    public void addInterest() {
        double interest = getBalance() * INTEREST_RATE;
        setBalance(getBalance() + interest);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > getBalance()) {
            System.out.println("Insufficient balance for withdrawal.");
        } else {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal successful. New balance: " + getBalance());
        }
    }
}

class CurrentAccount extends Account {
    private static final double MINIMUM_BALANCE = 3000.0;
    private static final double SERVICE_CHARGE = 100.0;

    // Constructor to initialize the current account
    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    // Method to issue check book
    public void issueCheckBook() {
        System.out.println("Check book issued to account number: " + getAccountNumber());
    }

    // Method to check and impose service charge
    public void checkAndImposeServiceCharge() {
        if (getBalance() < MINIMUM_BALANCE) {
            setBalance(getBalance() - SERVICE_CHARGE);
            System.out.println("Service charge imposed. Current balance: " + getBalance());
        }
    }
}

public class Acc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for Savings Account
        System.out.print("Enter Savings Account number: ");
        String savingsAccountNumber = scanner.nextLine();
        System.out.print("Enter initial balance for Savings Account: ");
        double savingsBalance = scanner.nextDouble();
        SavingsAccount savingsAccount = new SavingsAccount(savingsAccountNumber, savingsBalance);

        // Perform operations on Savings Account
        savingsAccount.addInterest();
        System.out.println("Savings Account Balance after interest: " + savingsAccount.getBalance());
        System.out.print("Enter amount to withdraw from Savings Account: ");
        double savingsWithdrawAmount = scanner.nextDouble();
        savingsAccount.withdraw(savingsWithdrawAmount);
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());

        // Get input for Current Account
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Current Account number: ");
        String currentAccountNumber = scanner.nextLine();
        System.out.print("Enter initial balance for Current Account: ");
        double currentBalance = scanner.nextDouble();
        CurrentAccount currentAccount = new CurrentAccount(currentAccountNumber, currentBalance);

        // Perform operations on Current Account
        currentAccount.issueCheckBook();
        currentAccount.checkAndImposeServiceCharge();
        currentAccount.setBalance(3300); // Manually setting balance for demonstration
        currentAccount.checkAndImposeServiceCharge();
        System.out.println("Current Account Balance: " + currentAccount.getBalance());

        scanner.close();
    }
}

