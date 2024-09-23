import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;

public class SocketListServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Server is listening on port 12345");
            while (true) {
                try (Socket socket = serverSocket.accept();
                     ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream())) {
                     
                    // Create a list of items
                    List<String> itemList = new ArrayList<>();
                    itemList.add("Apple");
                    itemList.add("Banana");
                    itemList.add("Cherry");

                    // Send the list to the client
                    out.writeObject(itemList);
                    System.out.println("List sent to the client.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
