/**
 * Mutiple inheritance in java.
 *
 */
interface  interface1
        {
            public void method1();
        }
 interface  interface12{

    public void method2();
}
public class MutipleInheritance implements interface1,interface12 {
    @Override
    public void method1() {
        System.out.println("interfce 1 method ");
    }

    public static void main(String arg[])
    {
     MutipleInheritance m=new MutipleInheritance();
     m.method1();
     m.method2();
    }

    @Override
    public void method2() {
        System.out.println("Interface 2 method");
    }
}
