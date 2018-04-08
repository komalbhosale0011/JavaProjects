import java.io.IOException;

/**
 * MarkOut Bound Exception
 */
import java.io.*;
public class MarkException {
    public static void main(String arg[]) throws IOException,MarkOutBoundException
    {
     DataInputStream input=new DataInputStream(System.in);
     System.out.println("Enter a Student Roll no");
     int rollno=Integer.parseInt(input.readLine());
     System.out.println(rollno);

        System.out.println("Enter a Student mark");
        int mark=Integer.parseInt(input.readLine());
        CheckingMark ch=new CheckingMark();
        try {
            boolean returnval=ch.checkMark(rollno, mark);
            if(returnval==true) {
                FileWriter f1 = new FileWriter("C:\\Users\\E059244\\Desktop\\store.txt", true);
                String roll = String.valueOf(rollno);
                f1.write("rollno:" + roll);
                String mark1 = String.valueOf(mark);
                f1.write("mark:" + mark1);
                f1.close();
            }
        }catch (MarkOutBoundException e)
        {
            System.out.println("Mark should be range  between 0 to 100 "+e.getMark());
        }
    }
}
class CheckingMark
{
    public boolean checkMark(int rollno,int mark) throws MarkOutBoundException,IOException
    {
        if((mark<0)||(mark>100))
        {

            throw new MarkOutBoundException(mark);
        }
        else
        {
         return true;
        }


    }

}
class MarkOutBoundException extends Exception
{
    int mark;
    MarkOutBoundException(int mark)
    {
       this.mark=mark;
       // System.out.println("Mark with in 0 to 100 only");
    }
    public int getMark()
    {
        return mark;
    }
}
