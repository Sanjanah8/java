import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CourseRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            registerCourse(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void registerCourse(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Registration failed: Age must be 18 or older.");
        } else {
            System.out.println("Registration successful!");
        }
    }
}
