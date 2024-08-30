import java.applet.Applet;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldApplet extends Applet {
    TextField textField;
    String message = "";

    public void init() {
        textField = new TextField(20);
        add(textField);

        textField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                message = "You entered: " + textField.getText();
                repaint();
            }
        });
    }

    public void paint(Graphics g) {
        g.drawString(message, 50, 50);
    }
}
