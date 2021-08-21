package com.company;
//Constructors Calling and Invoking
public class Customer {

    public String customerName;
    public long contactNumber;
    public String Address;
    public String customerId;

    public Customer(String customerName, long contactNumber, String Address){
        // this is parameterized constructor
        // "This" word is used when we have same name used as customername same as customername ::
        this();
        this.customerName = customerName;
        this.contactNumber = contactNumber;
        this.Address = Address;



    }

    public Customer() { // ******** Parameterless Constructor *******
        System.out.println("Parameter Less Constructor called");
    }

    public static void displayCustomerDetails(){
        //<<as we create object of the class then the parameter less constructor is called automatically>>

        Customer c = new Customer("Reddy",78525563, "Flat No 203 Astha Apt");
        System.out.println("Address: "+c.Address);
        System.out.println("Contact Number: "+c.contactNumber);
        System.out.println("Customer Name: "+c.customerName);
        System.out.println("CustomerID : "+ c.customerId);
    }

    public static void main(String[] args){

        displayCustomerDetails();



    }


}
