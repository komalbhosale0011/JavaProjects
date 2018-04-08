import java.io.*;

/**
 * to check no is prime .if not prime number then display Exception NotPrimeException else display message no is prime
 */
public class PrimeNumber{
    public static void main(String arg[]) throws IOException,NotPrimeException
    {
        DataInputStream input =new DataInputStream(System.in);
        System.out.println("Enter a Number to check no is prime or not");
        int number=Integer.parseInt(input.readLine());
        System.out.println(number);
        CheckingNumber ch=new CheckingNumber();
        try {
           boolean flag= ch.CheckPrime(number);
           if(flag==true)
           {
               throw new NotPrimeException(number);
           }
           else
           {
             System.out.println("Number is prime");
           }

        }catch(NotPrimeException e)
        {
            System.out.println("No is Not Prime:"+e.getNumber());
            e.printStackTrace();
        }

    }
}
class CheckingNumber
{
    public boolean CheckPrime(int number)
    {
        boolean flag=false;
        for(int i=2;i<number/2;i++)
        {
            if(number%i==0)
            {
                flag =true;
            }
        }
        if(flag==true)
        {
            return true;
        }

        else
        {
            return false;
        }
    }
}
 class NotPrimeException extends Exception
 {
     int number;
     public NotPrimeException(int no)
     {
       this.number=no;
     }

     public int getNumber() {
         return number;
     }
 }