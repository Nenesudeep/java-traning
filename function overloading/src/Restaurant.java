// Assingment number 2
// using two techniuqes.

public class Restaurant {

    public String restName;
    public long restContact;
    public String restAddress;
    public float rating;


    public Restaurant(String restName, long restContact, String restAddress, float rating){

        this.restName = restName;
        this.restContact = restContact;
        this.restAddress = restAddress;
        this.rating = rating;

    }

    public Restaurant() {

    }

          //static method is class method.
    public static void displayDetails(){   /// static method is used as this a direct class method. not to be used when doing important programing.

        Restaurant r2 = new Restaurant();

        System.out.println("Restaurant Details are");
        System.out.println("***************");
        r2.restName = "McDonalds";
        System.out.println("Restaurant Name:"+r2.restName);
        r2.restContact = 7855455;
        System.out.println("Contact number is :"+r2.restContact);
        r2.restAddress ="Vadodara";
        System.out.println("Address is :"+ r2.restAddress);


    }

    public   void dispDetails2(){   // Static method is no defined here

        System.out.println(this.rating);
        System.out.println(this.restAddress);
        System.out.println(this.restContact);
        System.out.println(this.restName);

    }

    public static void main(String[] args){
        Restaurant r = new Restaurant("Fancy",7805893,"Ammerpet Hyd",9);
        r.dispDetails2();
        Restaurant r3 =new Restaurant();
    //    System.out.println(r.rating+r.restContact+r.restAddress+r.restName);

         r3 .displayDetails();  // When we make static method then we can access the method by object as well as directly.
         displayDetails();
    }


}
