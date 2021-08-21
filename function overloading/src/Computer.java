public class Computer {
    private static int id;          // to increase the counter we  have two variables first id and the count6er variable.
    private static int counter = 0;

    public Computer() {
        id = ++counter;
    }  // Method is called automatically when object is called.

    public int getId() {
        return id;
    }

    // Rest of the methods
}

class Tester {
    public static void main(String[] args) {
        Computer comp1 = new Computer();
        System.out.println(comp1.getId());  // it will now print 1
        Computer comp2 = new Computer();
        Computer comp3 = new Computer();
        System.out.println(comp1.getId() + " " + comp2.getId() + " "  // it is printing after we create 3 objects so the counter is set on 3 if we print it intermediate then it will be one two and three accordingly.
                + comp3.getId());
    }
}

