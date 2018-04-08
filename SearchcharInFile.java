import java.io.*;
import java.util.Scanner;

/**
 * to a search for given word in file also display no of occurrences of char in the file
 * */

public class SearchcharInFile {
    public static void main(String arg[]) throws IOException
    {
        FileReader f1=new FileReader("C:\\Users\\E059244\\Desktop\\writing.txt");
        //Scanner s = new Scanner(System.in);
        System.out.println("Enter a search string in file");
        char c = (char) System.in.read();
        System.out.println(c);
        StringBuffer br=null;
        String str=null;
        int  i,cont=0;
        while((i=f1.read())!=-1)
        {
            char ch=(char)i;
            System.out.print(ch);
            if(ch==c)
            {
                cont++;
            }

        }

        System.out.println();
        System.out.println(cont);


    }
}
