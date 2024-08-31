// Title: Swap Two Integers Without Using a Temporary Variable

// This program swaps two integers without using a temporary variable. 
// It uses arithmetic operations to swap the values.

public class SwapWithoutTemp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        // Swap values using arithmetic operations
        a = a + b;  // a becomes 30
        b = a - b;  // b becomes 10 (original value of a)
        a = a - b;  // a becomes 20 (original value of b)
        
        // Display the swapped values
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
