package com.company;

public class Main {



    public static void main(String[] args) {

      Restaurant R = new Restaurant();

      R.setRestaurantName("MCD");
      R.setRestaurantAddress("HHAA AAHHU NHHA");
      R.setRating(7.5f);
      R.setRestaurantContact(554455666L);

      R.displayRestaurantDetails();

	// write your code here
    }
}

class Restaurant{

    private String restaurantName;
    private long restaurantContact;
    private String restaurantAddress;
    private float rating;



    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public long getRestaurantContact() {
        return restaurantContact;
    }

    public void setRestaurantContact(long restaurantContact) {
        this.restaurantContact = restaurantContact;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public void displayRestaurantDetails(){

//        this.restaurantName="McDonlad";
//        this.rating=4.1f;
//        this.restaurantContact=9988676767L;
//        this.restaurantAddress="SHLL ALOnG THE WAY";

        System.out.println("NAME "+this.restaurantName);
        System.out.println("rating"+this.rating);
        System.out.println("COntact"+this.restaurantContact);
        System.out.println("ADDRESS"+this.restaurantAddress);


    }


}
