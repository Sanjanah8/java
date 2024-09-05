import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        String fileName = "output.txt";
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Hello, world!\n");
            writer.write("Writing to a file using FileWriter.\n");
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
