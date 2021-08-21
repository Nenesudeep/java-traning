package com.company;

import java.util.Scanner;  // Importing Scanner Class to take the input from the user.

public class Input {

    public static void main(String[] args){

        Scanner Takeinput = new Scanner(System.in);
        System.out.println("Enter the number");

        int num = Takeinput.nextInt();    // for integer inout nextbyte is used.
        System.out.println("NUMBER YOU HAVE ENTEREd IS\n"+num);

        if (num<5){
            System.out.println("You are Topper");
        }

        else if (num>10 && num<30){
            System.out.println("You are dumb ");
        }
        else {
            System.out.println("OUT OF THE DATA BASE");
        }




    }

}
