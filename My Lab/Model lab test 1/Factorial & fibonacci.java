package operations;

public class Factorial {
    public static int calculate(int n) {
        if (n == 0) return 1;
        return n * calculate(n - 1);
    }
}

package operations;

public class Fibonacci {
    public static int calculate(int n) {
        if (n <= 1) return n;
        return calculate(n - 1) + calculate(n - 2);
    }
}

import operations.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + Factorial.calculate(5));
        System.out.println("Fibonacci of 6: " + Fibonacci.calculate(6));
    }
}
