import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * to implements choice ,checkbox radio button with appriate event handling
 */
public class EventHandingDemo extends Frame {
    Checkbox check1,male,female;
    CheckboxGroup radio1=new CheckboxGroup();
    Choice ch;
    Label l1=new Label("Hiii");
    EventHandingDemo()
    {
        setLayout(new GridLayout(2,2));
     check1=new Checkbox("Checkbox1");
     add(check1);
        check1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                l1.setText("You are Select check box");
            }
        });
     male=new Checkbox("male",radio1,false);
     female=new Checkbox("female",radio1,false);
     add(male);
     add(female);
        male.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                l1.setText("You are Select male radio button");
            }
        });
        female.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                l1.setText("You are Select female radio button");
            }
        });
     setSize(300,400);
     setVisible(true);
     ch=new Choice();

     ch.add("Item1");
     ch.add("Item2");
     ch.add("Item3");
     add(ch);
     add(l1);
     ch.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {
         l1.setText("You are Select choice item ");
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
        new EventHandingDemo();
    }

}
