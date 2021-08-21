abstract class Payment{

    private int customerId;

    public String paymentId;

    public double serviceTaxPercentage;

    public Payment(int customerId) {
        this.customerId = customerId;
    }


    abstract double payBill(double amount); // ***abstract Method***

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public double getServiceTaxPercentage() {
        return serviceTaxPercentage;
    }

    public void setServiceTaxPercentage(double serviceTaxPercentage) {
        this.serviceTaxPercentage = serviceTaxPercentage;
    }
    //Implement your code here
}

class DebitCardPayment extends Payment{

    private static int counter = 1000;
    private double discountPercentage;

    public DebitCardPayment(int customerId) {
        super(customerId);

        paymentId = "D"+(++counter);


    }

    @Override
    public double payBill(double amount){

        if(amount<=500){

            this.serviceTaxPercentage = 2.5;
            this.discountPercentage = 1;

        }
        if (amount>500 && amount<=1000){

            this.serviceTaxPercentage = 4;
            this.discountPercentage = 2;
        }

        if (amount>1000){

            this.discountPercentage=3;

            this.serviceTaxPercentage = 5;
        }


        double x = ((1+serviceTaxPercentage/100)*amount)  ;

        amount = x - (discountPercentage/100)*amount;

        return amount;


    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        DebitCardPayment.counter = counter;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    //Implement your code here
}

class CreditCardPayment extends  Payment{

    private static int count=1000;

    public CreditCardPayment(int customerId) {
        super(customerId);

        paymentId = "C"+(++count);
    }

    @Override
    double payBill(double amount) {

        if(amount<=500){

            serviceTaxPercentage = 2.5;


        }
        if (amount>500 && amount<=1000){

            serviceTaxPercentage = 5;

        }

        if (amount>1000){

            serviceTaxPercentage = 6;
        }

        return (1+(serviceTaxPercentage/100))*amount;


    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        CreditCardPayment.count = count;
    }
    //Implement your code here
}

class Testeer{
    public static void main(String[] args){
        DebitCardPayment debitCardPayment = new DebitCardPayment(101);
        double billAmount=Math.round(debitCardPayment.payBill(500)*100)/100.0;
        System.out.println("Customer Id: " + debitCardPayment.getCustomerId());
        System.out.println("Payment Id: " + debitCardPayment.getPaymentId());
        System.out.println("Service tax percentage: " + debitCardPayment.getServiceTaxPercentage());
        System.out.println("Discount percentage: " + debitCardPayment.getDiscountPercentage());
        System.out.println("Total bill amount: " + billAmount);

        CreditCardPayment creditCardPayment = new CreditCardPayment(102);
        billAmount=Math.round(creditCardPayment.payBill(1000)*100)/100.0;
        System.out.println("Customer Id: " + creditCardPayment.getCustomerId());
        System.out.println("Payment Id: " + creditCardPayment.getPaymentId());
        System.out.println("Service tax percentage: " + creditCardPayment.getServiceTaxPercentage());
        System.out.println("Total bill amount: " + billAmount);
    }
}