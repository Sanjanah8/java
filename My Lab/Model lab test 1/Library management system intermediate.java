package com.mycompany.jdbc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class LibraryGUI extends JFrame {
    private static final String URL = "jdbc:mysql://localhost:3306/library";
    private static final String USER = "root";
    private static final String PASSWORD = "Theweeknd*8";
    private final JTextField idField;

    private final JTextField titleField;
    private JTextField authorField;
    private final JTextArea displayArea;

    public LibraryGUI() {
        setTitle("Library Management System");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        panel.add(new JLabel("Book ID:"));
        idField = new JTextField();
        panel.add(idField);

        panel.add(new JLabel("Title:"));
        titleField = new JTextField();
        panel.add(titleField);

        panel.add(new JLabel("Author:"));
        authorField = new JTextField();
        panel.add(authorField);

        JButton insertButton = new JButton("Insert");
        insertButton.addActionListener((ActionEvent e) -> {
            insertBook();
        });
        panel.add(insertButton);

        JButton showButton = new JButton("Show All Books");
        showButton.addActionListener((ActionEvent e) -> {
            showAllBooks();
        });
        panel.add(showButton);

        add(panel, BorderLayout.NORTH);

        displayArea = new JTextArea();
        displayArea.setEditable(false);
        add(new JScrollPane(displayArea), BorderLayout.CENTER);
    }

    private void insertBook() {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String query = "INSERT INTO books (book_id, title, author) VALUES (?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setInt(1, Integer.parseInt(idField.getText()));
                pstmt.setString(2, titleField.getText());
                pstmt.setString(3, authorField.getText());
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Book inserted successfully.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void showAllBooks() {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM books")) {
            StringBuilder sb = new StringBuilder();
            while (rs.next()) {
                sb.append("Book ID: ").append(rs.getInt("book_id"))
                        .append(", Title: ").append(rs.getString("title"))
                        .append(", Author: ").append(rs.getString("author"))
                        .append("\n");
            }
            displayArea.setText(sb.toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LibraryGUI gui = new LibraryGUI();
            gui.setVisible(true);
        });
    }
}
