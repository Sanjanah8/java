import java.io.*;
import java.net.*;

// Sample object class
class Message implements Serializable {
    private String content;

    public Message(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

public class SocketObjectServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Server is listening on port 12345");
            while (true) {
                try (Socket socket = serverSocket.accept();
                     ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream())) {
                     
                    // Create a message object
                    Message message = new Message("Hello from the server!");
                    
                    // Send the object to the client
                    out.writeObject(message);
                    System.out.println("Message sent to the client.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
