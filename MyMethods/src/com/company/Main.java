package com.company;

public class Main {

    public static void myMethod() {

        int x=7;
        float y=6.43f;
        System.out.println(x+y);
    }

    public static void main(String[] args){
        myMethod();
        Multi(5,7,8);
        CheckAge(25);
    }
    /* This is the program which take parameters within itself so either you can declare in the program or inside the
    * method there is would be no errors  */

    public static void Multi(int x, int y, int z) {

        System.out.println("Multiplication is ");
        System.out.println((x*y*z));
    }
    // Function to for checking age
    public static void CheckAge(int age){

         if (age==17){
             System.out.println("You Seem Suspicious");
         }
         else if(age<17) {
             System.out.println(("You cannot go"));
         }
         else {
             System.out.println("You ARE Adult");
         }
    }
}
