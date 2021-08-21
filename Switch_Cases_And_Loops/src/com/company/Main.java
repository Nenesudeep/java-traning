package com.company;

import jdk.jfr.Experimental;

public class Main {


    public static void main(String[] args) {
                int birthday=10;

        if(birthday>9) {
            System.out.println("Yepii We Found your birthday here thank you");
        }
        switch (birthday){

            case 8:
                System.out.println("Your birthday is on 8th");

            case 9:
                System.out.println("That is a jackpot");
        }
        // For Loop Syntax Reverse Triangle
        int i;
        int j;
        for(i=5;i>0;i--) {   // For Upside down triangle just write for(i=0;i<4;i++)

            for (j = 1; j < i; ++j) {
                System.out.print("X");
            }
            System.out.println("X");
        } System.out.println("LoOP Did Not Work");

        int day = 4;
        switch (day) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }
    }



}
