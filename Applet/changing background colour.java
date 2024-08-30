import java.applet.Applet;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BackgroundColorApplet extends Applet {
    public void init() {
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                setBackground(Color.BLUE);
                repaint();
            }
        });
    }
}

