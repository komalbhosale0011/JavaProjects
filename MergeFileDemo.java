import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * to merge a two files accept file name from user using commandLine argument
 */
public class MergeFileDemo {
    public static void main(String arg[]) throws IOException {
        //"C:\\Users\\E059244\\Desktop\\fileinfo.txt"   "C:\\Users\\E059244\\Desktop\\store.txt" "C:\\Users\\E059244\\Desktop\\mergefile.txt"
        String file1 =arg[0];
        String file2 = arg[1];
        String file3 = arg[2];
        FileReader f1 = new FileReader(file1);
        FileReader f2 = new FileReader(file2);
        FileWriter f3 = new FileWriter(file3,true);
        int i;
        while ((i = f1.read()) != -1) {
          f3.write(i);
        }
        while ((i = f2.read()) != -1) {
            //char ch=(char)i;
            f3.write(i);
        }
       f1.close();
       f2.close();;
       f3.close();
    }
}