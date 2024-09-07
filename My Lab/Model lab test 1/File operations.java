import java.io.*;

public class FileOperations {
    public static void main(String[] args) {
        String data = "This is a sample text for file operations.";

        // Write to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read from file
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
