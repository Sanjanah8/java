import java.io.*;
import java.net.*;

public class TicTacToeClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345)) {
            // Client game logic goes here
            // For simplicity, the implementation is omitted
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
