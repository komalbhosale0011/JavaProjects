import java.applet.*;
import java.awt.*;

/**
 * using AWT/Layout Manager to draw a Human Face an applet
 */
public class Humanface extends Applet {
    public void init()
    {
        setSize(400,400);
    }
    public void paint(Graphics g)
    {
     g.drawOval(100,100,200,200);
     g.fillOval(140,140,13,13);
     g.fillOval(240,140,13,13);
     g.drawLine(200,150,200,200);
     g.drawArc(150,160,100,100,550,140);
    }
}
