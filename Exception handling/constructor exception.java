public class InvalidConstructorExample {
    private int value;

    public InvalidConstructorExample(int value) throws InvalidValueException {
        if (value < 0) {
            throw new InvalidValueException("Value cannot be negative.");
        }
        this.value = value;
    }

    public static void main(String[] args) {
        try {
            InvalidConstructorExample example = new InvalidConstructorExample(-1);
        } catch (InvalidValueException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}

class InvalidValueException extends Exception {
    public InvalidValueException(String message) {
        super(message);
    }
}
