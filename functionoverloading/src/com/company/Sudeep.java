package com.company;

public class Sudeep {

    public static void main(String[] args) {


        Order p = new Order(101, "Palak", "done");


        System.out.println(" Order Id: " + p.getOrderID() + "\n Ordered Food:" + p.getOrderedFoods());
        System.out.println(" Status:" + p.getStatus());
        System.out.println(" Total Price: " + p.calculateTotalPrice(100));

    }


}
