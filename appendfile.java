import java.io.*;

public class appendfile

{
    public static void main(String arg[]) throws IOException {
        DataInputStream input = new DataInputStream(System.in);
        System.out.println("Enter a reading file name");
        String filename=input.readLine();
        System.out.println("Enter a writing file name");
        String filename2=input.readLine();
        FileReader f1 = new FileReader(filename);
        FileWriter f2=new FileWriter(filename2,true);
         int i;
        while((i=f1.read())!=-1)
        {

            f2.write((char)i);

        }
        f1.close();
        f2.close();

    }
}
