class Booking{

    /// Static Assignment 3.
    private String customerEmail;
    private int seatsRequired;
    private boolean isBooked;
    private static int seatsAvailable;

    static {  // Static block has the top most priority. And Only Static declared variables can be there no other can be there if it is there then it will be error.

        seatsAvailable = 400;

    }

    public Booking(String customerEmail, int seatsRequired) {
        this.customerEmail = customerEmail;
        this.seatsRequired = seatsRequired;

        if (this.seatsRequired<=seatsAvailable) { /// compare it with the available seats and change the available seats by seats required.


           this.isBooked = true;
        }

        if (this.isBooked){
                seatsAvailable = seatsAvailable - this.seatsRequired;
            }
        else
            this.isBooked = false;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getSeatsRequired() {
        return seatsRequired;
    }

    public void setSeatsRequired(int seatsRequired) {
        this.seatsRequired = seatsRequired;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean isBooked) {
        isBooked = isBooked;
    }

    public static int getSeatsAvailable() {
        return seatsAvailable;
    }

    public static void setSeatsAvailable(int seatsAvailable) {
        seatsAvailable = seatsAvailable;
    }
    //Implement your code here
}

class Main {
    public static void main(String[] args) {
        Booking booking1 = new Booking("jack@email.com", 100);
        Booking booking2 = new Booking("jill@email.com", 350);

        //Create more objects and add them to the bookings array for testing your code

        Booking[] bookings = { booking1, booking2 };

        for (Booking booking : bookings) {
            if (booking.isBooked()) {
                System.out.println(booking.getSeatsRequired()+" seats successfully booked for "+booking.getCustomerEmail());
            }
            else {
                System.out.println("Sorry "+booking.getCustomerEmail()+", required number of seats are not available!");
                System.out.println("Seats available: "+Booking.getSeatsAvailable());
            }
        }
    }
}

