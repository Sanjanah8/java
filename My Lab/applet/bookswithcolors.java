import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

// The Applet class extends Applet and implements ItemListener for handling checkbox and radio button actions
public class ColoredBooksApplet extends Applet implements ItemListener {

    // Declare checkboxes for books and a group for radio buttons (colors)
    Checkbox book1, book2, book3; // Checkboxes for books
    Checkbox redColor, greenColor, blueColor; // Radio buttons for colors
    CheckboxGroup colorGroup; // Radio buttons must be in a group for mutual exclusion

    String selectedBooks = ""; // To store selected books
    String selectedColor = ""; // To store selected color

    public void init() {
        // Set background color for the applet
        setBackground(Color.lightGray);

        // Create checkboxes for books
        book1 = new Checkbox("Harry Potter");
        book2 = new Checkbox("Lord of the Rings");
        book3 = new Checkbox("The Alchemist");

        // Set colors for checkboxes
        book1.setForeground(Color.blue);
        book2.setForeground(Color.magenta);
        book3.setForeground(Color.orange);

        // Add ItemListener to the checkboxes
        book1.addItemListener(this);
        book2.addItemListener(this);
        book3.addItemListener(this);

        // Create a CheckboxGroup for radio buttons (only one color can be selected)
        colorGroup = new CheckboxGroup();

        // Create radio buttons for colors
        redColor = new Checkbox("Red", colorGroup, false);
        greenColor = new Checkbox("Green", colorGroup, false);
        blueColor = new Checkbox("Blue", colorGroup, false);

        // Set colors for radio buttons
        redColor.setForeground(Color.red);
        greenColor.setForeground(Color.green);
        blueColor.setForeground(Color.blue);

        // Add ItemListener to the radio buttons
        redColor.addItemListener(this);
        greenColor.addItemListener(this);
        blueColor.addItemListener(this);

        // Add the checkboxes and radio buttons to the applet
        add(book1);
        add(book2);
        add(book3);

        add(redColor);
        add(greenColor);
        add(blueColor);
    }

    // Handle the item events (for both checkboxes and radio buttons)
    public void itemStateChanged(ItemEvent e) {
        // Handle checkboxes for books
        selectedBooks = "Selected Books: ";
        if (book1.getState()) {
            selectedBooks += "Harry Potter ";
        }
        if (book2.getState()) {
            selectedBooks += "Lord of the Rings ";
        }
        if (book3.getState()) {
            selectedBooks += "The Alchemist ";
        }

        // Handle radio buttons for color selection
        selectedColor = "Favorite Color: ";
        if (redColor.getState()) {
            selectedColor += "Red";
        }
        if (greenColor.getState()) {
            selectedColor += "Green";
        }
        if (blueColor.getState()) {
            selectedColor += "Blue";
        }

        // Repaint the applet to reflect the changes
        repaint();
    }

    // Display the selected values
    public void paint(Graphics g) {
        g.drawString(selectedBooks, 20, 150);
        g.drawString(selectedColor, 20, 180);
    }
}

/*
<applet code="ColoredBooksApplet.class" width="400" height="300">
</applet>
*/
