package com.company;

public class Main {

    int x = 5;
    String Car = "GT";
    public  int plusMethod (int x,int y,int z){

        return (x+y*z);
    }


    public static double plusMethod(double x, double y, double z){
        return (x+y+z);
    }

    public  static int leapyear(int a){

        if (a%4==0){
            if(a%400==0 && a%100==0){
                System.out.println("Leap Year");
            }else {
                System.out.println("Not a Leap Year");
            }
        }
        return 0;   // If we do no have any return variable just return zero to int variable so no error occurs.

    }


    public static void minusMethod(){

        System.out.println("This is Minus Method");
    }

    public static void main(String[] args) {

        Main c = new Main();  // Objects needs to be created for calling the function without static.

        double Num1= plusMethod(1.5,4.66,6.45);
        System.out.println("Output for double method is " + Num1);

        int Num2= c.plusMethod(4,5,6);  // Initalizing and calling function
        System.out.println(Num2);

        Main myObj = new Main();        //Class Object is created of class Main.
        System.out.println(myObj.x);    //Only objects can access the information in a class

        int n3 = leapyear(1900);
        minusMethod();



    }
}


