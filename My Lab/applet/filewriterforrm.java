package SocketDateServer;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;

public class ApplicationFormm extends Applet implements ActionListener {
    TextField nameField, passwordField;
    TextArea addressArea;
    Choice courseChoice, yearChoice, cityChoice;
    CheckboxGroup collegeGroup;
    Checkbox cooking, drawing, playing, music;
    Button submitButton;
    Label statusLabel;

    Color lightBlue = new Color(173, 216, 230); // Light blue
    Color darkBlue = new Color(0, 0, 139); // Dark blue

    @Override
    public void init() {
        setBackground(lightBlue); // Set light blue as the background for the entire applet
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        gbc.gridx = 0; gbc.gridy = 0;
        add(new Label("Name:"), gbc);
        gbc.gridx = 1;
        nameField = new TextField(20);
        add(nameField, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        add(new Label("Course:"), gbc);
        gbc.gridx = 1;
        courseChoice = new Choice();
        courseChoice.add("MSc DS");
        courseChoice.add("B.Tech Computer Science");
        courseChoice.add("B.Tech Electronics");
        courseChoice.add("B.Tech Mechanical");
        courseChoice.add("B.Tech Civil");
        courseChoice.add("B.Tech Electrical");
        add(courseChoice, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        add(new Label("Year:"), gbc);
        gbc.gridx = 1;
        yearChoice = new Choice();
        yearChoice.add("I");
        yearChoice.add("II");
        yearChoice.add("III");
        yearChoice.add("IV");
        yearChoice.add("V");
        add(yearChoice, gbc);

        gbc.gridx = 0; gbc.gridy = 3;
        add(new Label("City:"), gbc);
        gbc.gridx = 1;
        cityChoice = new Choice();
        cityChoice.add("Chennai");
        cityChoice.add("Coimbatore");
        cityChoice.add("Madurai");
        cityChoice.add("Tiruchirappalli");
        cityChoice.add("Salem");
        cityChoice.add("Erode");
        cityChoice.add("Tirunelveli");
        cityChoice.add("Vellore");
        cityChoice.add("Thoothukudi");
        cityChoice.add("Dindigul");
        cityChoice.add("Thanjavur");
        cityChoice.add("Kanchipuram");
        cityChoice.add("Karur");
        cityChoice.add("Sivakasi");
        cityChoice.add("Cuddalore");
        cityChoice.add("Tirupur");
        cityChoice.add("Pudukkottai");
        cityChoice.add("Nagercoil");
        cityChoice.add("Udhagamandalam (Ooty)");
        cityChoice.add("Kumbakonam");
        cityChoice.add("Virudhunagar");
        cityChoice.add("Nagapattinam");
        cityChoice.add("Ranipet");
        cityChoice.add("Perambalur");
        add(cityChoice, gbc);

        gbc.gridx = 0; gbc.gridy = 4;
        add(new Label("College:"), gbc);
        gbc.gridx = 1;
        collegeGroup = new CheckboxGroup();
        add(new Checkbox("TCE", collegeGroup, true), gbc);
        gbc.gridy++;
        add(new Checkbox("Other", collegeGroup, false), gbc);

        gbc.gridx = 0; gbc.gridy = 6;
        add(new Label("Hobbies:"), gbc);
        gbc.gridx = 1;
        Panel hobbiesPanel = new Panel();
        hobbiesPanel.setBackground(lightBlue);
        hobbiesPanel.add(cooking = new Checkbox("Cooking"));
        hobbiesPanel.add(drawing = new Checkbox("Drawing"));
        hobbiesPanel.add(playing = new Checkbox("Playing"));
        hobbiesPanel.add(music = new Checkbox("Listening to music"));
        add(hobbiesPanel, gbc);

        gbc.gridx = 0; gbc.gridy = 7;
        add(new Label("Address:"), gbc);
        gbc.gridx = 1;
        addressArea = new TextArea(4, 20);
        add(addressArea, gbc);

        gbc.gridx = 0; gbc.gridy = 8;
        add(new Label("Password:"), gbc);
        gbc.gridx = 1;
        passwordField = new TextField(20);
        passwordField.setEchoChar('*');
        add(passwordField, gbc);

        gbc.gridx = 1; gbc.gridy = 9;
        submitButton = new Button("Submit");
        submitButton.setBackground(Color.GREEN);
        submitButton.addActionListener(this);
        add(submitButton, gbc);

        gbc.gridx = 0; gbc.gridy = 10; gbc.gridwidth = 2;
        statusLabel = new Label("");
        statusLabel.setAlignment(Label.CENTER);
        add(statusLabel, gbc);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String name = nameField.getText().trim();
            String address = addressArea.getText().trim();
            String password = passwordField.getText().trim();

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

      
            if (writeToFile(name, address, password)) {
                showMessage("Application submitted successfully!");
            } else {
                showMessage("Error submitting application. Please try again.");
            }
        }
    }

    private boolean writeToFile(String name, String address, String password) {
        try (FileWriter writer = new FileWriter("application_data.txt", true)) { 
            writer.write("Name: " + name + "\n");
            writer.write("Address: " + address + "\n");
            writer.write("Password: " + password + "\n");
            writer.write("--------------------------\n");
            return true; 
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage()); 
            return false; 
        }
    }

    private void showMessage(String message) {
        Dialog dialog = new Dialog(new Frame(), "Message", true);
        dialog.setLayout(new FlowLayout());
        dialog.add(new Label(message));
        Button okButton = new Button("OK");
        okButton.addActionListener((ActionEvent e) -> {
            dialog.dispose();
        });
        dialog.add(okButton);
        dialog.setSize(300, 150);
        dialog.setVisible(true);
    }
}
