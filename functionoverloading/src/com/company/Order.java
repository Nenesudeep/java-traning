package com.company;

public class Order {
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOrderedFoods() {
        return orderedFoods;
    }

    public void setOrderedFoods(String orderedFoods) {
        this.orderedFoods = orderedFoods;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    private int orderID;
    private String orderedFoods;
    private int total;
    private String status;
    private int price = 2000;


    public Order(int orderID, String orderedFoods, String status){
        System.out.println(" ORDER DETAILS");
        this.orderID = orderID;
        this.orderedFoods = orderedFoods;
        //this.totalPrice = totalPrice;
        this.status = status;


    }


    public  double calculateTotalPrice(int unitPrice){

        this.total = unitPrice *105/100;  // Five Percent increment for the ordered food in unit price....

        System.out.println("Price"+price);



        return total;



    }

//    public void nonstatic(){
//        System.out.println("can access static variable inside non-static method : " + price);
//        main(new String[2]);
//    }
//
//



}

