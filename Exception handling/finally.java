public class FinallyExample {
    public static void main(String[] args) {
        try {
            int data = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Catch block: Division by zero.");
        } finally {
            System.out.println("Finally block: Executed no matter what.");
        }
    }
}
