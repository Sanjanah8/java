import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonApplet extends Applet {
    Button button;
    String message = "";

    public void init() {
        button = new Button("Click Me");
        add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                message = "Button Clicked!";
                repaint();
            }
        });
    }

    public void paint(Graphics g) {
        g.drawString(message, 50, 50);
    }
}
