import java.io.*;
import java.net.*;
import java.util.List;

public class SocketListClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345);
             ObjectInputStream in = new ObjectInputStream(socket.getInputStream())) {
             
            // Receive the list from the server
            List<String> itemList = (List<String>) in.readObject();
            System.out.println("Received List: " + itemList);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
