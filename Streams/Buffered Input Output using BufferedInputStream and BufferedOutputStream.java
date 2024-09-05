import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamExample {
    public static void main(String[] args) {
        String sourceFile = "source.bin";
        String destFile = "destBuffered.bin";

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile))) {

            int byteData;
            while ((byteData = bis.read()) != -1) {
                bos.write(byteData);
            }
            System.out.println("Buffered file copy completed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
