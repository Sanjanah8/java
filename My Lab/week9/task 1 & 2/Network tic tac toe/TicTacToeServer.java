import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;

public class TicTacToeServer {
    private static List<Socket> players = new ArrayList<>();

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Tic-Tac-Toe Server is listening on port 12345");
            while (true) {
                Socket playerSocket = serverSocket.accept();
                players.add(playerSocket);
                System.out.println("Player connected: " + players.size());

                if (players.size() == 2) {
                    new Thread(new GameHandler(players)).start();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class GameHandler implements Runnable {
    private List<Socket> players;

    public GameHandler(List<Socket> players) {
        this.players = players;
    }

    public void run() {
        // Tic-Tac-Toe game logic goes here
        // For simplicity, the implementation is omitted
    }
}
