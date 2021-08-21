public class Test {

    public Test(){
        // parameterless constructor.
    }


    public String getRestName() {
        return restName;
    }


    public void setRestName(String restName) {
        this.restName = restName;
    }


    public long[] getContactNumbers() {
        return contactNumbers;
    }


    public void setContactNumbers(long[] contactNumbers) {
        this.contactNumbers = contactNumbers;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    private long contactNumbers[];
    private String address;
    private String restName;


    public Test(String restName, long contactNumbers[], String address){

        this.address = address;
        this.restName = restName;
        this.contactNumbers = contactNumbers;


    }

    public void displayDetails() {

        System.out.println(this.address);
        System.out.println(this.restName);

        // For printing the ContactNumbers. we need to create loop then only we can print contactnumbers.
        for(int i=0; i<contactNumbers.length; i++) {

            System.out.print("These are contacts:"+this.contactNumbers[i]+" ");// for printing the numbers it is neccessary to write [] otherwise it will print address ..


        }

    }
    // if we want to excute our program here then no need to use set and get functions.they are to be used in other classes.
    public static void main(String[] args) {

        long contactNumbers[] = {9778844554L,78899445L,7789945L,67846846L};
        Test t = new Test("McDonlad's",contactNumbers,"Flat no 203\n astha apartments\n near gipcl circle");
        t.displayDetails();

    }

}
