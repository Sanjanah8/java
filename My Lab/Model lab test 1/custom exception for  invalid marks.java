class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

public class MarksValidation {
    public static void main(String[] args) {
        try {
            int marks = 105;
            validateMarks(marks);
        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validateMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks should be between 0 and 100.");
        }
        System.out.println("Valid marks: " + marks);
    }
}
