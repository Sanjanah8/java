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

public class Rec1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user for the length and width of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Create a rectangle object using the constructor
        Rectangle rectangle = new Rectangle(length, width);

        // Calculate and print the area and perimeter
        double area = rectangle.getArea();
        double perimeter = rectangle.getPerimeter();

        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);

        scanner.close();
    }
}

class Rectangle {
    private double length;
    private double width;

    // Constructor to initialize the object
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    public double getArea() {
        return length * width;
    }

    // Method to calculate the perimeter of the rectangle
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // Getters and Setters for length and width
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}

