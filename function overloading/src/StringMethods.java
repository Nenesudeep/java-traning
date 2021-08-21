import java.util.Locale;
import java.util.Scanner;

public class StringMethods {

//  This program is price given by user and discount is also decided by user.
    public  double discAdd(double n1){  // *****double n1 is same which is being used in the main method*****

        System.out.println("Enter the discount you want to give");

        Scanner n = new Scanner(System.in); // n is only object after creating it we need to create a varible like what the input should be..

        double discount = n.nextDouble();  // Taking input form user the discount he wants to give however it may be.

        discount = n1 * (1-(discount/100));

        System.out.println(discount); // This method is used in another class by inheritance concept..

        return discount;


    }

    public static void main(String[] args){

        System.out.println("Enter the price");

        Scanner myOBj = new Scanner(System.in);

        int n1 = myOBj.nextInt();   //Always declare a variable pointing towards scanner object.

        StringMethods m = new StringMethods();

        System.out.println("Price After discount is:"+m.discAdd(n1));  // if static is used



        String s1 = "NANI is best in world";
        String s2 = new String("nani");
        System.out.println(s1.length());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.endsWith("NANI"));  // endswith function gives true or flase if the string endswith the same thing

        System.out.println(s1.equalsIgnoreCase(s2)); // ignore CASES and checks for the string is matching or not. Function also give true and false
        System.out.println(s1.equals(s2));

        System.out.println(s1.replaceAll("\\s","")); // to remove the white spaces from the string
    }
}
