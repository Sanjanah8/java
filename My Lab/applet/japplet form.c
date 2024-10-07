package SocketDateServer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class ApplicationForm extends JFrame implements ActionListener {
    private final JTextField nameField;
    private final JTextField passwordField;
    private final JTextArea addressArea;
    private final JComboBox<String> courseChoice;
    private final JComboBox<String> yearChoice;
    private final JComboBox<String> cityChoice;
    private final ButtonGroup collegeGroup;
    private final JRadioButton tceButton;
    private final JRadioButton otherButton;
    private final JCheckBox cooking;
    private JCheckBox drawing, playing, music;
    private final JButton submitButton;
    private final JLabel statusLabel;

    public ApplicationForm() {
        setTitle("Application Form");
        setSize(400, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        // Name
        gbc.gridx = 0; gbc.gridy = 0;
        add(new JLabel("Name:"), gbc);
        gbc.gridx = 1;
        nameField = new JTextField(20);
        add(nameField, gbc);

        // Course
        gbc.gridx = 0; gbc.gridy = 1;
        add(new JLabel("Course:"), gbc);
        gbc.gridx = 1;
        courseChoice = new JComboBox<>(new String[]{
                "MSc DS", "B.Tech Computer Science", "B.Tech Electronics",
                "B.Tech Mechanical", "B.Tech Civil", "B.Tech Electrical"
        });
        add(courseChoice, gbc);

        // Year
        gbc.gridx = 0; gbc.gridy = 2;
        add(new JLabel("Year:"), gbc);
        gbc.gridx = 1;
        yearChoice = new JComboBox<>(new String[]{"I", "II", "III", "IV", "V"});
        add(yearChoice, gbc);

        // City
        gbc.gridx = 0; gbc.gridy = 3;
        add(new JLabel("City:"), gbc);
        gbc.gridx = 1;
        cityChoice = new JComboBox<>(new String[]{
                "Chennai", "Coimbatore", "Madurai", "Tiruchirappalli", "Salem",
                "Erode", "Tirunelveli", "Vellore", "Thoothukudi", "Dindigul",
                "Thanjavur", "Kanchipuram", "Karur", "Sivakasi", "Cuddalore",
                "Tirupur", "Pudukkottai", "Nagercoil", "Udhagamandalam (Ooty)",
                "Kumbakonam", "Virudhunagar", "Nagapattinam", "Ranipet", "Perambalur"
        });
        add(cityChoice, gbc);

        // College
        gbc.gridx = 0; gbc.gridy = 4;
        add(new JLabel("College:"), gbc);
        gbc.gridx = 1;
        collegeGroup = new ButtonGroup();
        tceButton = new JRadioButton("TCE", true);
        otherButton = new JRadioButton("Other", false);
        collegeGroup.add(tceButton);
        collegeGroup.add(otherButton);
        add(tceButton, gbc);
        gbc.gridy++;
        add(otherButton, gbc);

        // Hobbies
        gbc.gridx = 0; gbc.gridy = 6;
        add(new JLabel("Hobbies:"), gbc);
        gbc.gridx = 1;
        JPanel hobbiesPanel = new JPanel();
        cooking = new JCheckBox("Cooking");
        drawing = new JCheckBox("Drawing");
        playing = new JCheckBox("Playing");
        music = new JCheckBox("Listening to music");
        hobbiesPanel.add(cooking);
        hobbiesPanel.add(drawing);
        hobbiesPanel.add(playing);
        hobbiesPanel.add(music);
        add(hobbiesPanel, gbc);

        // Address
        gbc.gridx = 0; gbc.gridy = 7;
        add(new JLabel("Address:"), gbc);
        gbc.gridx = 1;
        addressArea = new JTextArea(4, 20);
        add(new JScrollPane(addressArea), gbc);

        // Password
        gbc.gridx = 0; gbc.gridy = 8;
        add(new JLabel("Password:"), gbc);
        gbc.gridx = 1;
        passwordField = new JPasswordField(20);
        add(passwordField, gbc);

        // Submit button
        gbc.gridx = 1; gbc.gridy = 9;
        submitButton = new JButton("Submit");
        submitButton.setBackground(Color.GREEN);
        submitButton.addActionListener(this);
        add(submitButton, gbc);

        // Status label
        gbc.gridx = 0; gbc.gridy = 10; gbc.gridwidth = 2;
        statusLabel = new JLabel("");
        statusLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(statusLabel, gbc);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String name = nameField.getText().trim();
            String address = addressArea.getText().trim();
            String password = passwordField.getText().trim();
            String course = (String) courseChoice.getSelectedItem();
            String year = (String) yearChoice.getSelectedItem();
            String city = (String) cityChoice.getSelectedItem();
            String college = collegeGroup.getSelection().getActionCommand();
            StringBuilder hobbies = new StringBuilder();
            if (cooking.isSelected()) hobbies.append(cooking.getText()).append(", ");
            if (drawing.isSelected()) hobbies.append(drawing.getText()).append(", ");
            if (playing.isSelected()) hobbies.append(playing.getText()).append(", ");
            if (music.isSelected()) hobbies.append(music.getText()).append(", ");
            if (hobbies.length() > 0) hobbies.setLength(hobbies.length() - 2); // Remove last comma

            if (name.isEmpty()) {
                showMessage("Please enter your name.");
                return;
            }
            if (address.isEmpty()) {
                showMessage("Please enter your address.");
                return;
            }
            if (password.isEmpty()) {
                showMessage("Please enter your password.");
                return;
            }

            try (FileWriter writer = new FileWriter("application_data.txt", true)) {
                writer.write("Name: " + name + "\n");
                writer.write("Course: " + course + "\n");
                writer.write("Year: " + year + "\n");
                writer.write("City: " + city + "\n");
                writer.write("College: " + college + "\n");
                writer.write("Hobbies: " + hobbies + "\n");
                writer.write("Address: " + address + "\n");
                writer.write("Password: " + password + "\n");
                writer.write("--------------------------------------\n");
                showMessage("Application submitted successfully!");
            } catch (IOException ioException) {
                showMessage("Error writing to file.");
            }
        }
    }

    private void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Message", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ApplicationForm form = new ApplicationForm();
            form.setVisible(true);
        });
    }
}
