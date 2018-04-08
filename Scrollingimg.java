import java.awt.*;
import java.applet.*;
import java.awt.event.*;
    /*<applet code=imgscrl height=300 width=300></applet>*/
    public class Scrollingimg extends Applet implements Runnable
    {
        Thread t1=new Thread(this);
        Image img;
        int maxx=20,maxy=20;
        public void init()
        {
            img=getImage(getDocumentBase(),"C:\\Users\\E059244\\Desktop\\MASTERCARD.png");
            t1.start();
        }
        public void run()
        {
            try
            {
                for(;;)
                {
                    maxx+=20;
                    if(maxx==1000)
                        maxx=20;
                    Thread.sleep(500);
                    repaint();
                }
            }
            catch(Exception e)
            {
            }
        }
        public void paint(Graphics g)
        {
            g.drawImage(img,maxx,maxy,this);
        }
    }
