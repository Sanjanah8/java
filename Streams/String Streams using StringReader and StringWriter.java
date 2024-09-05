import java.io.StringReader;
import java.io.StringWriter;
import java.io.IOException;

public class StringStreamExample {
    public static void main(String[] args) {
        // Writing to StringWriter
        StringWriter writer = new StringWriter();
        writer.write("This is an example of using StringWriter.\n");
        writer.write("Writing data to a string stream.");

        // Printing the content written to StringWriter
        System.out.println("StringWriter Content: \n" + writer.toString());

        // Reading from StringReader
        StringReader reader = new StringReader(writer.toString());
        int data;
        try {
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
