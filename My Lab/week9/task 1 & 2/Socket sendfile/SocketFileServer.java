import java.io.*;
import java.net.*;

public class SocketFileServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Server is listening on port 12345");
            while (true) {
                try (Socket socket = serverSocket.accept();
                     FileInputStream fileInput = new FileInputStream("file_to_send.txt");
                     OutputStream out = socket.getOutputStream()) {
                    byte[] buffer = new byte[4096];
                    int bytesRead;
                    while ((bytesRead = fileInput.read(buffer)) != -1) {
                        out.write(buffer, 0, bytesRead);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
