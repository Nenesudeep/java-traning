package com.company;

import java.util.Scanner;

public class Main {

    Scanner obj2 =new Scanner(System.in);

    int c = obj2.nextInt();

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter Number 1:");
        int a = obj.nextInt() ;
	    System.out.println("Enter Number 2:");
	    int b = obj.nextInt();

        Main x =new Main();
//**********************************************
        int y =x.c;                       // This is using of the variable c created outside main method..
        System.out.println("Print C:"+y); // variable y is used to print variable c for the from public class
//***********************************************
	    int sum = a+b;
	    System.out.println("Sum is :"+sum);
        // write your code here
    }
}
