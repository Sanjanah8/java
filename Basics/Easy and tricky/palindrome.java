// Title: Check if a Given Integer is a Palindrome

// This program checks if a given integer is a palindrome. 
// It converts the number to a string and compares it with its reverse.

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Convert the number to a string and reverse it
        String original = Integer.toString(num);
        String reverse = new StringBuilder(original).reverse().toString();
        
        // Check if the original string is equal to the reversed string
        if (original.equals(reverse)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
}
