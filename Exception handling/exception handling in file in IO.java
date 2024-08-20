import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIOExample {
    public static void main(String[] args) {
        File file = new File("nonexistent.txt");
        try {
            FileReader fr = new FileReader(file);
            System.out.println("File found and read successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("Error: IO exception occurred.");
        }
    }
}
