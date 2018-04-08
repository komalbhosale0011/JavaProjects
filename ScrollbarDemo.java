/**
 *
 */
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class ScrollbarDemo extends Frame implements AdjustmentListener{
    Scrollbar s1;
    Scrollbar s2;
    Scrollbar s3;
    Label l;
    public ScrollbarDemo()
    {
         s1=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,255);
         s2=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,255);
         s3=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,255);
         l=new Label("komal");
         l.setBounds(40,100,50,100);

        s1.addAdjustmentListener(this);
        s2.addAdjustmentListener(this);
        s3.addAdjustmentListener(this);
        add(s1,"North");
        add(s2,"East");
        add(s3,"West");
        setSize(800,900);
        setVisible(true);
        add(l);

       addWindowListener(new WindowAdapter() {
           public void windowClosing(WindowEvent e) {
               System.exit(0);
           }
       });
    }
    public void adjustmentValueChanged(AdjustmentEvent e) {
     int x,y,z;
     x=s1.getValue();
     y=s2.getValue();
     z=s3.getValue();
     setBackground(new Color(x,y,z));
     l.setBackground(new Color(x,y,z));
     l.setForeground(new Color((255-x),(255-y),(255-z)));
     l.setText("ScrollBar Moving at Red->"+x+"Green->"+y+"Blue"+z);
    }
    public static  void main(String arg[])
    {

        ScrollbarDemo s= new ScrollbarDemo();
    }
}
