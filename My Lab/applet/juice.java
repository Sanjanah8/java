package juicecheckbox;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class OfferApplet extends Applet implements ItemListener {

    Checkbox juice1, juice2, juice3, juice4; 
    Checkbox chocolate1, chocolate2, chocolate3, chocolate4;
    String offer = "Offer: No"; 

    @Override
    public void init() {
        setBackground(Color.white);

        juice1 = new Checkbox("Apple Juice");
        juice2 = new Checkbox("Orange Juice");
        juice3 = new Checkbox("Grape Juice");
        juice4 = new Checkbox("Mango Juice");

        chocolate1 = new Checkbox("Milk Chocolate");
        chocolate2 = new Checkbox("Dark Chocolate");
        chocolate3 = new Checkbox("White Chocolate");
        chocolate4 = new Checkbox("Hazelnut Chocolate");

        add(juice1);
        add(juice2);
        add(juice3);
        add(juice4);

        add(chocolate1);
        add(chocolate2);
        add(chocolate3);
        add(chocolate4);
        juice1.addItemListener(this);
        juice2.addItemListener(this);
        juice3.addItemListener(this);
        juice4.addItemListener(this);

        chocolate1.addItemListener(this);
        chocolate2.addItemListener(this);
        chocolate3.addItemListener(this);
        chocolate4.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        boolean juiceSelected = juice1.getState() || juice2.getState() || juice3.getState() || juice4.getState();
        boolean chocolateSelected = chocolate1.getState() || chocolate2.getState() || chocolate3.getState() || chocolate4.getState();

        if (juiceSelected && chocolateSelected) {
            offer = "Offer: Yes";
        } else {
            offer = "Offer: No";
        }

        repaint();
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(offer, 20, 150);
    }
}


