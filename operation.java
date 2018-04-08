/**
 * package math pefrom different addition,substraction,multiplication,division
 */
public class operation {

    public static class Operation {
        public static void main(String arg[]) {
            int no1 = 12;
            int no2 = 34;
            int addvalue;
            addvalue= math.Addition.addition(no1, no2);
            System.out.println("Addition of two no:"+addvalue);
            int subvalue= math.Substraction.substraction(no1, no2);
            System.out.println("substraction of two no:"+subvalue);
            double divvalue= math.Division.division(no1, no2);
            System.out.println("division of two no:"+divvalue);
            int mutivalue= math.Mutilplication.multiplication(no1, no2);
            System.out.println("multiplication of two no:"+mutivalue);
        }

    }
}
