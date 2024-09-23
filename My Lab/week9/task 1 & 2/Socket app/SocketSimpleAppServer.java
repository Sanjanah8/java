import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.*;

public class SocketSimpleAppServer {
    private static JTextArea textArea;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Server");
        textArea = new JTextArea(20, 50);
        frame.getContentPane().add(new JScrollPane(textArea), BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            textArea.append("Server is listening on port 12345\n");
            while (true) {
                Socket socket = serverSocket.accept();
                textArea.append("Client connected\n");
                new Thread(new ClientHandler(socket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class ClientHandler implements Runnable {
    private Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            String message;
            while ((message = in.readLine()) != null) {
                SocketSimpleAppServer.textArea.append("Client: " + message + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
