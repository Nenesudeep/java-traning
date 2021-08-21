package com.company;
import java.math.RoundingMode;        // importing classes for Rounding mode.
import java.text.DecimalFormat;       // importing for decimal format.

public class add {

    public static int adding(int a, int b) {   /// Static Method used without using object

        return (a + b);
    }

    public double avg(double a, double b, double c){ /// using object is compulsory

        return ((a+b+c)/3)*100/100;

    }
    public static void main(String args[]) {
//        int a = 10;
//        int b = 20;
//        int sum = a+b;
        add tester = new add();
        int n1 = adding(5, 6);   // here we need to create a variable to store the value of the int directly in case of static .

        System.out.println(n1);

        double n2 = tester.avg(10 ,20,30);  // here static is not used so we are calling the method through object that is benign created.
        System.out.format("%.2f\n",n2);  // Rounding off to two decimals. format.

// below is the second method to round off from importing the classes.
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        System.out.println(df.format(n2));
/* The above thing is used as to round of to two digits and we can have both the above methods to round off to nearest two.*/




        Main book = new Main();
        book.dispName();

    }

}

