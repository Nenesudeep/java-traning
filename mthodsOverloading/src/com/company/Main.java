package com.company;

//Importing the Scanner class
import java.util.Scanner;
public class Main {

    public void dispName(){
        System.out.println("SUDEEP");
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        int totalCost = 0;
        char wantToAddFoodItem = 'Y';
        int unitPrice = 10;
        int quantity = 1;

        // Using while Loop:-

        while (wantToAddFoodItem == 'Y') {
            totalCost = totalCost + (quantity * unitPrice);

            System.out.println("Order placed successfully");

            System.out.println("Total cost: " + totalCost);

            System.out.println("Do you want to add more food items to your order? Y or N");
            // it could be anything in the place of 'in' in the string in like String input or inn or uniii.

            String in = sc.nextLine(); // Accepting input from the customer we can write next as well as nextLine also.
            // Extracting first character from the input string
            wantToAddFoodItem = in.charAt(0);
        }
    }
}

