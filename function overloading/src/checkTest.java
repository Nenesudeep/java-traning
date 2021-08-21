public class checkTest extends Test {


    public static void main(String[] args){

        Test d = new Test();

        d.setRestName("THIs is name");

        long[] contactNumbers = {1233455L, 464684L}; // THis is how we can use arrays outside the class for private members.

        d.setContactNumbers(contactNumbers);

        d.setAddress("THIS is ADDRESS");

        d.displayDetails();


    }
}
