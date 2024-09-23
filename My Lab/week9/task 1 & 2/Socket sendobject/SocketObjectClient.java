import java.io.*;
import java.net.*;

class Message implements Serializable {
    private String content;

    public String getContent() {
        return content;
    }
}

public class SocketObjectClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345);
             ObjectInputStream in = new ObjectInputStream(socket.getInputStream())) {
             
            // Receive the object from the server
            Message message = (Message) in.readObject();
            System.out.println("Received Message: " + message.getContent());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
