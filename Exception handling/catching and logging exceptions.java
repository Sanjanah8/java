import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LoggingExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            logException(e);
        }
    }

    public static void logException(Exception e) {
        try (FileWriter fw = new FileWriter("log.txt", true);
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println("Error: " + e.getMessage());
        } catch (IOException ioException) {
            System.out.println("Failed to log exception: " + ioException.getMessage());
        }
    }
}
