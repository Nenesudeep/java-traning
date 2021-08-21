package com.company;

public class Second {
    public static void main(String[] args){
        Main myObj = new Main();
        System.out.println(myObj.x); // This variable x is being accessed from the Super Class 'MAIN' here it is not defined.
    }
}
// Inheritance.
class Car extends Main  {

    private String modelName = "Mustang";    // This 'Private Access' Modifier and this can only be used in this class.

    public static void main(String[] args){

        Car myCar = new Car();


        System.out.println(myCar.modelName + myCar.Car); //accessing the Mustang by '.' i.e dot operator

        /* Here 'myCar.Car' is accessed from 'Main' Class this is the example of inheritance as this class can be used in
         Car Class. */

    }

}
