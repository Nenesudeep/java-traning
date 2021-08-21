class MovieTicket {

    private int movieId;
    private int noOfSeats;
    private double costPerTicket;

    public MovieTicket(int movieId, int noOfSeats) {
        this.movieId = movieId;
        this.noOfSeats = noOfSeats;
    }

    public double calculateTotalAmount(){

        double totalAmount = 0;

        switch (this.movieId){

            case 111:{
                costPerTicket = 7;
                return 7*this.noOfSeats*1.02;
                }


            case 112:
                costPerTicket = 8;
                return 8*this.noOfSeats*1.02;

            case 113:
                costPerTicket = 8.5;
                return 8.5*this.noOfSeats*1.02;
            default:
                costPerTicket = 0;

        }

        double a = costPerTicket * noOfSeats;
        return a * (2/100);



    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public double getCostPerTicket() {
        return costPerTicket;
    }

    public void setCostPerTicket(double costPerTicket) {
        this.costPerTicket = costPerTicket;
    }
    //Implement your code here
}



class Tester {
    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket(112, 3);
        double amount = movieTicket.calculateTotalAmount();
        if (amount==0)
            System.out.println("Sorry! Please enter valid movie Id and number of seats");
        else
            System.out.println("Total amount for booking : $" + Math.round(amount*100)/100.0);
    }
}
