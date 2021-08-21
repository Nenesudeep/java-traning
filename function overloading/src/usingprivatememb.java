public class usingprivatememb {


    // this is example of abstraction and encapsulation as the members are private and we do not show the main body to the user

    public static void main(String [] args){
        showprivate s = new showprivate();

         // below we are setting the new address as the access modifers are private we need to use these getter and setter.
        //
        s.setRating(7.8f);
        s.setRestAddress("Flat no 203\nastha apartments\nopp Sbi Bank\nVadodara");
        s.setRestContact(7046776351L);
        s.setRestName("BIGGE RESTAURANT");
        s.dispDetails2();
        s.displayDetails(); //****** using the display details from showprivate class.****\

        // We can display rating as below also other wise we can create a method and display for acheiveing abastraction.

        System.out.println("RATING FROM GETTER METHOD "+s.getRating());

    }


}
