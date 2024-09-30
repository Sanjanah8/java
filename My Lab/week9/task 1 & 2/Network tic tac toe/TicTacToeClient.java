package SocketDateServer;
import java.io.*;
import java.net.*;
public class TicTacToeClient {
    public static void main(String[] args) {
        try {
            try (Socket socket = new Socket("localhost", 20011)) {
                DataInputStream input = new DataInputStream(socket.getInputStream());
                DataOutputStream output = new DataOutputStream(socket.getOutputStream());
                
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                while (true) {
                    String serverMessage = input.readUTF();
                    System.out.println(serverMessage);
                    
                    if (serverMessage.contains("Your move")) {
                        int move = Integer.parseInt(reader.readLine());
                        output.writeInt(move);
                    } else if (serverMessage.contains("wins") || serverMessage.contains("draw")) {
                        break;
                    }
                }
            }
        } catch (IOException e) {
        }
    }
}





