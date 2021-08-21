public class showprivate {

    public String getRestName() {
        return restName;
    }

    public void setRestName(String restName) {
        this.restName = restName;
    }

    public long getRestContact() {
        return restContact;
    }

    public void setRestContact(long restContact) {
        this.restContact = restContact;
    }

    public String getRestAddress() {
        return restAddress;
    }

    public void setRestAddress(String restAddress) {
        this.restAddress = restAddress;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    private String restName;
    private long restContact;
    private String restAddress;
    private float rating;


    public showprivate(String restName, long restContact, String restAddress, float rating){

        this.restName = restName;
        this.restContact = restContact;
        this.restAddress = restAddress;
        this.rating = rating;

    }

    public showprivate() {  // Parameterless constructor.
                            // this will only give the null vlaues to the variables if no argument is passed to avoid error.
    }

    //static method is class method.
    public static void displayDetails(){   /// static method is used as this a direct class method. not to be used when doing important programing.

        Restaurant r2 = new Restaurant(); // this is object of restaraunt class..

        System.out.println("Restaurant Details are");
        System.out.println("***************");
        r2.restName = "McDonalds";
        System.out.println("Restaurant Name:"+r2.restName);
        r2.restContact = 7855455;
        System.out.println("Contact number is :"+r2.restContact);
        r2.restAddress ="Vadodara";
        System.out.println("Address is :"+ r2.restAddress);


    }

    public   void dispDetails2(){   // Static method is not defined here

        System.out.println("RATING IS:"+this.rating);
        System.out.println("ADDRESS:"+this.restAddress);
        System.out.println("CONTACT NO:"+this.restContact);
        System.out.println("NAME OF RESTAURANT:"+this.restName);

    }

    public static void main(String[] args){
        showprivate r = new showprivate("Fancy",7805893,"Ammerpet Hyd",9);
        r.dispDetails2();
        Restaurant r3 =new Restaurant();
        //    System.out.println(r.rating+r.restContact+r.restAddress+r.restName);

        //r3 .displayDetails();  // When we make static method then we can access the method by object as well as directly.
        displayDetails();
        showprivate r2 = new showprivate();

    }



}
