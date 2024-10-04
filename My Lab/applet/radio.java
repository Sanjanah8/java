package SocketDateServer;
import java.awt.*;
import java.awt.event.*;
public class RadiobuttonExample extends Frame implements ItemListener {

    CheckboxGroup radioGroup;
    Checkbox radio1, radio2;

    public RadiobuttonExample() {
        setTitle("Radiobutton Example");
        setSize(300, 200);
        setLayout(new FlowLayout());

        radioGroup = new CheckboxGroup();

        radio1 = new Checkbox("Option 1", radioGroup, true);
        radio2 = new Checkbox("Option 2", radioGroup, false);

        radio1.addItemListener(this);
        radio2.addItemListener(this);

        add(radio1);
        add(radio2);

        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == radio1) {
            System.out.println("Radio 1 selected");
        } else if (e.getSource() == radio2) {
            System.out.println("Radio 2 selected");
        }
    }

    public static void main(String[] args) {
        new RadiobuttonExample();
    }
}
