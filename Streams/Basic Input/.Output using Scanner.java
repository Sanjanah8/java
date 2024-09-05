import java.util.Scanner;

public class BasicIO {
    public static void main(String[] args) {
        // Creating Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Displaying the input
        System.out.println("Hello " + name + "! You are " + age + " years old.");

        scanner.close(); // Closing the scanner to prevent resource leak
    }
}
