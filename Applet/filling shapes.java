import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class FilledShapesApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(50, 50, 150, 100);
        
        g.setColor(Color.RED);
        g.fillOval(50, 200, 150, 100);
    }
}
