
import java.awt.*;
import java.awt.event.*;

public class CheckboxExample extends Frame implements ItemListener {

    Checkbox checkbox1, checkbox2;

    public CheckboxExample() {
        setTitle("Checkbox Example");
        setSize(300, 200);
        setLayout(new FlowLayout());

        checkbox1 = new Checkbox("Option 1");
        checkbox2 = new Checkbox("Option 2");

        checkbox1.addItemListener(this);
        checkbox2.addItemListener(this);

        add(checkbox1);
        add(checkbox2);

        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == checkbox1) {
            System.out.println("Checkbox 1: " + checkbox1.getState());
        } else if (e.getSource() == checkbox2) {
            System.out.println("Checkbox 2: " + checkbox2.getState());
        }
    }

    public static void main(String[] args) {
        CheckboxExample checkboxExample = new CheckboxExample();
    }
}
