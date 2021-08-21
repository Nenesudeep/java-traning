public class foodie {

    public static void main(String [] args){
        // Firstly we need to give the address values so that when we have customer object we just need to pass the variable of address class and all the values will be passed in it.
       Address a = new Address("F520","sama road","Vadodara",390024);

        Customer cust = new Customer(6543325L,a,"FD654422335","NANI"); // first constructor..

       cust.displayDetails();

       Customer cust2 = new Customer("F6779998","SUDEEP",a); // second constructor created and called

       cust2.displayDetails();




    }


}

class Customer{

    private String customerID;
    private String customerName;

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) { // we can use setter methods as well to intialize the vaules.
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    private long contactNumber;
    private Address address;  // <<Aggregation as this is reference of the class Address>>

    public Customer(){
        // parameter less constructor.
    }
                                        // this is how we pass other class refrence in another class
    public Customer(long contactNumber, Address address, String customerID, String customerName){

        this.contactNumber = contactNumber;
        this.customerID=customerID;
        this.customerName=customerName;
        this.address=address; // creating this same as the above variables//

    }

    public Customer(String customerID, String customerName, Address address){

        this.address=address;
        this.customerName=customerName;
        this.customerID=customerID;

    }

    public void displayDetails(){

        System.out.println("Contact Number is"+getContactNumber()); // Only use get functions when using private variables.
        System.out.println("Customer ID:-"+getCustomerID());
        System.out.println("Customer Name:-"+getCustomerName());
        System.out.println("Customer city:- "+ address.getCity()+"\n ZipCode"+address.getZipCode()+"\n  Door No:- "+address.getDoorNo()+"\n Street No:- "+address.getStreet());
    }



}

class Address extends Customer{



    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
     private String doorNo;
     private String street;
     private String city;
     private int zipCode;

     void displayPrivatedetails(){

         Customer c = new Customer();

         Address a = Customer.class.getDeclaredAnnotation(Customer);


     }


     public Address(String doorNo, String street, String city, int zipCode){

         this.doorNo=doorNo;
         this.city=city;
         this.zipCode=zipCode;
         this.street=street;




     }

}
