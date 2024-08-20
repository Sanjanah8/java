public class ThreadExceptionHandlingExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            try {
                int result = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Thread 1: Division by zero.");
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                int[] arr = {1, 2, 3};
                System.out.println(arr[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Thread 2: Array index out of bounds.");
            }
        });

        thread1.start();
        thread2.start();
    }
}
