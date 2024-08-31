// Title: Check if a Given Number is Prime

// This program checks if a given number is prime. It optimizes the check 
// by only testing divisibility up to the square root of the number.

import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Assume the number is prime until proven otherwise
        boolean isPrime = true;
        
        // Check divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        
        // Handle special cases
        if (num < 2) {
            isPrime = false;
        }
        
        // Display the result
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
