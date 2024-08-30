import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseApplet extends Applet {
    String message = "Hello!";

    public void init() {
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                message = "Mouse Clicked!";
                repaint();
            }
        });

        addMouseMotionListener(new MouseAdapter() {
            public void mouseMoved(MouseEvent e) {
                message = "Mouse Moved!";
                repaint();
            }
        });
    }

    public void paint(Graphics g) {
        g.drawString(message, 50, 50);
    }
}
