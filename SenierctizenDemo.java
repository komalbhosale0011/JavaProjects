/**
 * to accept senier citizen name and age store in text file if age below 60 throw invalid age Exception
 * */
import java.io.*;
import java.util.Scanner;

public class SenierctizenDemo {
    public static  void main(String arg[]) throws  IOException,InValidAgeException{
        Scanner input;
        input =new Scanner(System.in);
        System.out.println("Enter a senier citizen name:");
        String name = input.nextLine();
        System.out.println("Enter a senier citizen Age:");
        int age = input.nextInt();
        try{
            CheckingAge ch=new CheckingAge();

             boolean b=ch.toCheckAge(age);
             FileWriter f1=new FileWriter("C:\\Users\\E059244\\Desktop\\fileinfo.txt",true);
             f1.write("Senier Citizen name:"+name);
             f1.write("Senier Citizen age :"+age);
            f1.close();
            System.out.println("Detail in file save succesfully");

        }catch (InValidAgeException e)
        {
            System.out.println("senier citizen age should be 1 to 60"+e.getAge());
            e.printStackTrace();
        }
    }

}


class CheckingAge
{

   public boolean toCheckAge(int age) throws InValidAgeException
   {

    if(age>60)
    {
      throw new InValidAgeException(age);
    }
    else
    {
        return true;
    }

   }

}

class InValidAgeException extends Exception
{
    int age;
    public InValidAgeException(int age)
    {
        this.age=age;
    }
    public int getAge()
    {
        return age;
    }
}
