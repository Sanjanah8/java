// Perform Basic Arithmetic Operations: Sum, Difference, Product, and Quotient
//program accepts two integers from the user and performs basic arithmetic operations 
// (addition, subtraction, multiplication, and division). It handles division by zero by checking 
// if the denominator is zero.

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        // Calculate sum, difference, product, and quotient
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num2 != 0 ? num1 / num2 : 0;  // Handle division by zero
        
        // Display the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
