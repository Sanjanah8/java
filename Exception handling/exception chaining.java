public class ExceptionChainingExample {
    public static void main(String[] args) {
        try {
            causeException();
        } catch (CustomException e) {
            System.out.println("Caught exception: " + e.getMessage());
            System.out.println("Original cause: " + e.getCause());
        }
    }

    public static void causeException() throws CustomException {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            throw new CustomException("Custom exception occurred", e);
        }
    }
}

class CustomException extends Exception {
    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }
}
