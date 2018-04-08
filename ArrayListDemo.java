/**
 * ArrayList Operation
 */
import java.util.*;
public class ArrayListDemo  {
    public static void main(String arg[])
    {
        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("first");
        arrayList.add("second");
        arrayList.add("third");
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.isEmpty());
        System.out.println("size of arraylist"+arrayList.size());
        System.out.println("index of second element "+arrayList.indexOf("second"));
        System.out.println("to check contain thrid element in arraylist or not"+arrayList.contains("third"));
        List l1=(ArrayList)arrayList.clone();
        System.out.println(l1);
        List<String> li=new ArrayList<String>();
        li.addAll(l1);
        System.out.println(li);
       li.clear();
        System.out.println(li);

    }
}
