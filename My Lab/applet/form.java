import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ApplicationForm extends Applet implements ActionListener {
    TextField nameField, passwordField;
    TextArea addressArea;
    Choice courseChoice, yearChoice, cityChoice;
    CheckboxGroup collegeGroup;
    Checkbox cooking, drawing, playing, music;
    Button submitButton;
    Label statusLabel;
    
    public void init() {
        setLayout(new FlowLayout());
        
        // Name
        add(new Label("Name:"));
        nameField = new TextField(20);
        add(nameField);
        
        // Course
        add(new Label("Course:"));
        courseChoice = new Choice();
        courseChoice.add("MSc DS");
        add(courseChoice);
        
        // Year Dropdown
        add(new Label("Year:"));
        yearChoice = new Choice();
        yearChoice.add("I");
        yearChoice.add("II");
        yearChoice.add("III");
        yearChoice.add("IV");
        yearChoice.add("V");
        add(yearChoice);
        
        // City Dropdown - List of major cities in Tamil Nadu
        add(new Label("City:"));
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
        add(cityChoice);
        
        // College Radio Button
        add(new Label("College:"));
        collegeGroup = new CheckboxGroup();
        add(new Checkbox("TCE", collegeGroup, true));
        add(new Checkbox("Other", collegeGroup, false));
        
        // Hobbies Checkboxes
        add(new Label("Hobbies:"));
        cooking = new Checkbox("Cooking");
        drawing = new Checkbox("Drawing");
        playing = new Checkbox("Playing");
        music = new Checkbox("Listening to music");
        add(cooking);
        add(drawing);
        add(playing);
        add(music);
        
        // Address TextArea
        add(new Label("Address:"));
        addressArea = new TextArea(4, 20);
        add(addressArea);
        
        // Password Field
        add(new Label("Password:"));
        passwordField = new TextField(20);
        passwordField.setEchoChar('*');
        add(passwordField);
        
        // Submit Button
        submitButton = new Button("Submit");
        submitButton.addActionListener(this);
        add(submitButton);
        
        // Status Label
        statusLabel = new Label("");
        add(statusLabel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String name = nameField.getText();
            if (!name.isEmpty()) {
                statusLabel.setText("Hi " + name + ", application submitted successfully!");
            } else {
                statusLabel.setText("Please enter your name.");
            }
        }
    }
}
