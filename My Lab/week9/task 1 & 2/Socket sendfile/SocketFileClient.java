import java.io.*;
import java.net.*;

public class SocketFileClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345);
             InputStream in = socket.getInputStream();
             FileOutputStream fileOutput = new FileOutputStream("received_file.txt")) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                fileOutput.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
