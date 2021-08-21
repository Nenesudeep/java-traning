public class This_Assignment_2 {

    public static void main(String[] args){

        order O = new order();

        O.setOrderedFoods("Spinach Pizza");
        O.setOrderID(101);
        O.setStatus("Ordered");
        System.out.println(O.calculateTotalPrice(33));
        System.out.println(O.getOrderedFoods());



    }
}

class order{

    private int orderID;
    private String orderedFoods;
    private double totalPrice;
    private String status;

    double calculateTotalPrice(int unitPrice){

        this.totalPrice = unitPrice * 1.05;

        return this.totalPrice;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getOrderedFoods() {
        return orderedFoods;
    }

    public void setOrderedFoods(String orderedFoods) {
        this.orderedFoods = orderedFoods;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
