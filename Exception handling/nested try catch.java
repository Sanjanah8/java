public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3, 4, 5};
            try {
                int result = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Division by zero.");
            }
            System.out.println(arr[10]); // Will cause ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Index is out of bounds.");
        }
    }
}
