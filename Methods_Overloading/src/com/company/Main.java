package com.company;

public class Main {

    public static int plusMethod (int x,int y,int z){

        return x+y+z;
    }


    public static double plusMethod(double x, double y, double z){
        return x+y+z;
    }

    public static void main(String[] args) {

        double Num1= plusMethod(1.5,4.66,6.45);
        System.out.println("Output for double method is " + Num1);

        int Num2= plusMethod(4,5,6);
        System.out.println(Num2);
    }
}
