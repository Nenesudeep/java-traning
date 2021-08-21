import java.util.ArrayList;
// Here Writing extends is most important otherwise this class would not understand if we give function from another class Stringmethods which i have created here in another tab.
public class WrapClass extends StringMethods {

    public static void main(String[] args){

        // Declaration of array here it is done.
        ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Here we need to use wrapper classes to store that particular values. like "integer" and not "int"
        myNumbers.add(0,5); // it is not mandatory to write the index it will automatically store it in the zero index..
        myNumbers.add(1,3);
        myNumbers.add(2,7);

        System.out.println(myNumbers.get(0)); // gets index value of the array.and prints the value.


        System.out.println(myNumbers);

        // Wrapper classes are nothing but CLasses here Integer class is being called and the object is crearted.

        Integer myObj = 456;  // INTEGER IS WRAPPER TYPE PRIMITIVE TYPE

        Double myDoubleObj = 412.321;

        System.out.println("Integer Value:"+myObj); // Printing the value of myObj.
        System.out.println("Double Value:"+myDoubleObj);

        // Here the StringMethods Function is used by inheritance concept of OOps.

        StringMethods k = new StringMethods();

        k.discAdd(100); // GIve the Price here


    }

}
