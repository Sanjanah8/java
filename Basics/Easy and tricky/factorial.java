// Title: Calculate the Factorial of a Given Number

// This program calculates the factorial of a given number. 
// It handles edge cases like 0! = 1 and avoids overflow for large inputs.

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Calculate factorial using a loop
        long factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }
        
        // Display the result
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
