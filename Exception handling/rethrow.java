public class RethrowExceptionExample {
    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Caught rethrown exception: " + e.getMessage());
        }
    }

    public static void validateAge(int age) throws InvalidAgeException {
        try {
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above.");
            }
        } catch (InvalidAgeException e) {
            System.out.println("Caught and rethrowing exception: " + e.getMessage());
            throw e; // Rethrow the exception
        }
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
