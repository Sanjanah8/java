package SocketDateServer;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class CheckboxRadioApplet extends Applet implements ItemListener {


    Checkbox javaCheckbox, pythonCheckbox, cppCheckbox;  
    Checkbox maleRadio, femaleRadio;  
    CheckboxGroup genderGroup;
    String selectedGender = "", selectedLanguages = "";

    @Override
    public void init() {
      
        javaCheckbox = new Checkbox("Java");
        pythonCheckbox = new Checkbox("Python");
        cppCheckbox = new Checkbox("C++");

        javaCheckbox.addItemListener(this);
        pythonCheckbox.addItemListener(this);
        cppCheckbox.addItemListener(this);

        genderGroup = new CheckboxGroup();

        maleRadio = new Checkbox("Male", genderGroup, false);
        femaleRadio = new Checkbox("Female", genderGroup, false);

        maleRadio.addItemListener(this);
        femaleRadio.addItemListener(this);

        add(javaCheckbox);
        add(pythonCheckbox);
        add(cppCheckbox);

        add(maleRadio);
        add(femaleRadio);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
       
        selectedLanguages = "Selected Languages: ";
        if (javaCheckbox.getState()) {
            selectedLanguages += "Java ";
        }
        if (pythonCheckbox.getState()) {
            selectedLanguages += "Python ";
        }
        if (cppCheckbox.getState()) {
            selectedLanguages += "C++ ";
        }

        selectedGender = "Selected Gender: ";
        if (maleRadio.getState()) {
            selectedGender += "Male";
        }
        if (femaleRadio.getState()) {
            selectedGender += "Female";
        }

        repaint();
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(selectedLanguages, 20, 150);
        g.drawString(selectedGender, 20, 180);
    }
}


