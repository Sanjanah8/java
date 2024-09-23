import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.*;

public class SocketSimpleAppClient {
    private static JTextField textField;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Client");
        textField = new JTextField(50);
        JButton sendButton = new JButton("Send");

        sendButton.addActionListener(e -> sendMessage());

        JPanel panel = new JPanel();
        panel.add(textField);
        panel.add(sendButton);
        
        frame.getContentPane().add(panel, BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        try {
            Socket socket = new Socket("localhost", 12345);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            sendButton.addActionListener(e -> {
                try {
                    String message = textField.getText();
                    out.write(message);
                    out.newLine();
                    out.flush();
                    textField.setText("");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void sendMessage() {
        // Logic for sending message (handled in action listener above)
    }
}
