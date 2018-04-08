import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ItemListener;

/**
 * Display text on label “ Core Java Programming” in larger size, with bold and
 Times New Roman font, take three buttons with captions RED, GREEN &
 BLUE. on the click event of each button respective colour should change for
 the background of label. Use swings.
 */

public class SwingDemo extends JFrame{

       Label l1;
    CheckboxGroup c1=new CheckboxGroup();
    Checkbox red,green,blue;


    SwingDemo() {
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 500);
        l1=new Label("Core Java Programming");
        l1.setFont(new Font("Times New Roman",Font.BOLD,25));
        red = new Checkbox("Red", c1, false);
        green = new Checkbox("Green", c1, false);
        blue = new Checkbox("Blue", c1, false);
        add(red);
        add(green);
        add(blue);
        add(l1);
        red.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                l1.setBackground(Color.RED);
            }

        });

        green.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                l1.setBackground(Color.GREEN);
            }

        });

        blue.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                l1.setBackground(Color.BLUE);
            }

        });
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
               System.exit(0);
            }
        });
    }
 public static void main(String arg[])
 {
     new SwingDemo();

 }
}
