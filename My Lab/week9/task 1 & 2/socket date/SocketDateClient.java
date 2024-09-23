import java.io.*;
import java.net.*;

public class SocketDateClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345)) {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String date = in.readLine();
            System.out.println("Current Date and Time: " + date);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
