public class Bill {
// EXERCISE ON STATIC METHODS...
    private static int count=9000;   // Static variables are const once they are declared and
    private String billID;

    public Bill(String paymentMode) { // this method is the most important one

        billID = "B"+(++count);      // Here we are combining string and integer it will be B9000. string contacts as number and letter combines
        setPaymentMode(paymentMode);

    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getBillID() {
        return billID;
    }

    public void setBillID(String billID) {
        this.billID = billID;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    private String paymentMode;

}
class Testerr {
    public static void main(String[] args) {


        char ca = 'b';
        Bill bill1 = new Bill("DebitCard");
        Bill bill2 = new Bill("PayPal");
        Bill bill3 = new Bill("CreditCard");

        //Create more objects and add them to the bills array for testing your code

        Bill[] bills = { bill1, bill2, bill3 };  // Bill array is being created and it is beign accessed from for loop::



        for (Bill bill : bills) {
            System.out.println("Bill Details");
            System.out.println("Bill Id: " + bill.getBillID());
            System.out.println("Payment method: " + bill.getPaymentMode());
            System.out.println();
        }
    }
}

