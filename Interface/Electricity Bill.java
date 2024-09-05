package com.mycompany.hello;
// Define the interface for ElectricityBill
interface ElectricityBill {
    void calculateBill(int units);
    void printBill();
}

// Residential class
class Residential implements ElectricityBill {
    private double billAmount;

    @Override
    public void calculateBill(int units) {
        billAmount = units * 5;
        if (billAmount < 100) {
            billAmount = 100; // minimum charge
        }
    }

    @Override
    public void printBill() {
        System.out.println("Residential Electricity Bill: " + billAmount);
    }
}

// Commercial class
class Commercial implements ElectricityBill {
    private double billAmount;

    @Override
    public void calculateBill(int units) {
        billAmount = units * 8;
        if (billAmount < 300) {
            billAmount = 300; // minimum charge
        }
    }

    @Override
    public void printBill() {
        System.out.println("Commercial Electricity Bill: " + billAmount);
    }
}

public class ElectricityBillExample {
    public static void main(String[] args) {
        ElectricityBill res = new Residential();
        res.calculateBill(10);
        res.printBill();

        ElectricityBill com = new Commercial();
        com.calculateBill(30);
        com.printBill();
    }
}

