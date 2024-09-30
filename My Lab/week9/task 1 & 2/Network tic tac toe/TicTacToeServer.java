package SocketDateServer;

import java.io.*;
import java.net.*;
import java.util.*;
public class TicTacToeServer {
    private static final List<GameSession> gameSessions = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(20011);
        System.out.println("Tic-Tac-Toe Server started. Waiting for players...");
        while (true) {
            Socket player1Socket = serverSocket.accept();
            System.out.println("Player 1 connected.");
            Socket player2Socket = serverSocket.accept();
            System.out.println("Player 2 connected.");
            GameSession gameSession = new GameSession(player1Socket, player2Socket);
            gameSessions.add(gameSession);
            new Thread(gameSession).start();
        }
    }
}
class GameSession implements Runnable {
    private final Socket player1Socket;
    private final Socket player2Socket;
    private final char[] board = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
    private char currentPlayer = 'X';
    public GameSession(Socket player1Socket, Socket player2Socket) {
        this.player1Socket = player1Socket;
        this.player2Socket = player2Socket;
    }
    @Override
    public void run() {
        try {
            DataInputStream input1 = new DataInputStream(player1Socket.getInputStream());
            DataOutputStream output1 = new DataOutputStream(player1Socket.getOutputStream());
            DataInputStream input2 = new DataInputStream(player2Socket.getInputStream());
            DataOutputStream output2 = new DataOutputStream(player2Socket.getOutputStream());
            output1.writeUTF("Welcome Player 1 (X)");
            output2.writeUTF("Welcome Player 2 (O)");
            boolean gameRunning = true;
            while (gameRunning) {
                sendBoard(output1);
                sendBoard(output2);
                if (currentPlayer == 'X') {
                    output1.writeUTF("Your move (X): ");
                    int move = input1.readInt();
                    if (isValidMove(move)) {
                        board[move] = 'X';
                        currentPlayer = 'O';
                    }
                } else {
                    output2.writeUTF("Your move (O): ");
                    int move = input2.readInt();
                    if (isValidMove(move)) {
                        board[move] = 'O';
                        currentPlayer = 'X';
                    }
                }
                String status = checkGameStatus();
                if (!status.equals("continue")) {
                    sendBoard(output1);
                    sendBoard(output2);
                    output1.writeUTF(status);
                    output2.writeUTF(status);
                    gameRunning = false;
                }
            }
            player1Socket.close();
            player2Socket.close();
        } catch (IOException e) {
        }
    }
    private void sendBoard(DataOutputStream out) throws IOException {
        out.writeUTF("\n" + board[0] + "|" + board[1] + "|" + board[2] + "\n" +
                     "-+-+-\n" + board[3] + "|" + board[4] + "|" + board[5] + "\n" +
                     "-+-+-\n" + board[6] + "|" + board[7] + "|" + board[8] + "\n");
    }
    private boolean isValidMove(int move) {
        return move >= 0 && move < 9 && board[move] == ' ';
    }
    private String checkGameStatus() {
        if ((board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
            (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
            (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
            (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
            (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
            (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
            (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
            (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer)) {
            return "Player " + currentPlayer + " wins!";
        }
        boolean draw = true;
        for (char cell : board) {
            if (cell == ' ') {
                draw = false;
                break;
            }
        }
        if (draw) {
            return "It's a draw!";
        }
        return "continue";
    }
}