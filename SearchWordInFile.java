/**
 * to a search for given word in file also display no of occurrences of word in the file
 */
import java.io.*;

public class SearchWordInFile {
    public static void main(String arg[]) throws IOException
    {
        FileReader f1=new FileReader("C:\\Users\\E059244\\Desktop\\writing.txt");
        DataInputStream input =new DataInputStream(System.in);
        System.out.println("Enter a search string in file");
        String search=input.readLine();
        StringBuffer br=null;
        String str="";
        int  i,cont=0;
         while((i=f1.read())!=-1)
         {
             char ch=(char)i;
             str=str+String.valueOf(ch);

         }
         int count=0;
        System.out.println(str);
         if(str.contains(search)==true)
         {
             count++;
         }
        System.out.println("Your Enter :"+search+"\nno of occurrences of word in the file:"+count);
         }


    }
