// this is the tryout of the
class Tester {
    public static void main(String[] args) {
        Carr c1 = new Carr("Red");
        Carr c2 = new Carr("Green");
        Carr c3 = new Carr("Blue");
        System.out.println("Number of cars created: " + Carr.getNumberOfCars());
    }

    static {
        System.out.println("Tester class loaded");
    }
}

class Carr {
    private static String color;
  //  private String color;  // when we are calling this static method then we need have static variable declared otherwise it will show error.
    private static int numberOfCars = 0;

    static {
        System.out.println("Car class loaded");
    }

    public Carr(String color) {
        this.color = color;
        numberOfCars++;
    }

    public static String getColor() {
        return color;
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }
}

