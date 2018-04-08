/**
 * Multithreading application to demo following threads
 * 1.display all no divisible by 7 from 1 to 100
 * 2.display  all even no from 51 to 100
 * 3.display the massage "Welcome to java" 15 times.
 */
public class MultithreadingApplication {
    public static void main(String arg[])
    {
        Divisible7 d=new Divisible7();
        d.run();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Evenno e=new Evenno();
        e.run();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException s) {
            s.printStackTrace();
        }
        Message m=new Message();
        m.run();

    }
}

class Divisible7 extends Thread
{
     public void run()
     {
         System.out.println("display all no divisible by 7 from 1 to 100");
         int i;
         for(i=1;i<=100;i++)
         {
             if(i%7==0)
             {
                 System.out.println(i);
             }
         }
     }

}
class Evenno extends Thread
{
    public void run()
    {
        int i;
        System.out.println("display  all even no from 51 to 100");
        for(i=51;i<=100;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }

}
class Message extends Thread
{
    public void run()
    {
        System.out.println("display the massage Welcome to java 15 times.");
        int i;
        for(i=1;i<=15;i++)
            System.out.println(i+".Welcome to java");

    }

}
