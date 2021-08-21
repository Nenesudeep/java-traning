class Cabin {
    public int cabinNumber;

    Cabin(int number) {
        this.cabinNumber = number;
    }
}

public class Professor {
    public String name;
    public Cabin cabin;

    public Professor(String name, Cabin c) {
        this.name = name;
        this.cabin = c;
    }

    public void updateCabin(Cabin c) {
        this.cabin.cabinNumber = c.cabinNumber;
    }

    public static void main(String args[]) {
        Cabin c1 = new Cabin(121);

        System.out.println(c1.cabinNumber);  // here 121,..

        Professor p1 = new Professor("Ronald", c1);
        Professor p2 = new Professor("Bonnie", c1);
        Cabin c2 = new Cabin(122);
        System.out.println(c1.cabinNumber); // here 121
        p1.updateCabin(c2);  // here cabin number has been updated and after this line howsoever you call cabin number it will be 122 always.
        System.out.println(p1.cabin.cabinNumber);// p1.cabin.cabinnumber..means calling the super class.
        System.out.println(c1.cabinNumber+c2.cabinNumber);
        System.out.println(p2.cabin.cabinNumber);
    }

}