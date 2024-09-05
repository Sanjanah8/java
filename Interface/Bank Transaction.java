package com.mycompany.hello;
// Define the Transaction interface
interface Transaction {
    void deposit(double amount);
    void withdraw(double amount);
}

// Implement the interface for SavingsAccount
class SavingsAccount implements Transaction {
    private double balance;

    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ", New Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

// Implement the interface for CurrentAccount
class CurrentAccount implements Transaction {
    private double balance;

    public CurrentAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ", New Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Overdraft not allowed.");
        }
    }
}

public class BankTransactionExample {
    public static void main(String[] args) {
        Transaction savings = new SavingsAccount(500);
        Transaction current = new CurrentAccount(1000);

        savings.deposit(100);
        savings.withdraw(200);

        current.deposit(500);
        current.withdraw(1600);
    }
}

