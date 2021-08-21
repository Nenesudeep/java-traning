package com.company;

import java.util.Objects;
// Assingment Done with All Test cases passed. Happy.
class Bill{

    double findPrice(int itemId){
    // Advanced Switch case
            switch (itemId) {
                case 1001:
                    return 25;

                case 1002:
                    return 20;

                case 1003:
                    return 23;

                case 1004:
                    return 18;
                default:
                    return 0;
        }
    }

    double findPrice(String brandName, String itemType,int size ){

        if (Objects.equals(brandName, "Puma")){

            if (Objects.equals(itemType,"T-shirt")){

                if (size==34||size==36){
                    return 25;
                }

            }
            if (Objects.equals(itemType,"Skirt")){

                if (size==38||size==40){
                    return 20;
                }
            }

        }

        if (Objects.equals(brandName,"Reebok")){

            if (Objects.equals(itemType,"T-shirt")){

                if (size==34||size==36){
                    return 23;
                }

            }
            if (Objects.equals(itemType,"Skirt")){

                if (size==38||size==40){

                    return 18;
                }
            }

        }

            return 0;


    }





    //Implement your code here
}

class ContractEmployeee {

    public static void main(String[] args) {

        Bill bill = new Bill();

        double price = bill.findPrice(1001);
        if(price>0)
            System.out.println("Price of the selected item is $"+price);
        else
            System.out.println("The Item Id is invalid");

        price = bill.findPrice("Reebok","Skirt",38);
        if(price>0)
            System.out.println("Price of the selected item is $"+price);
        else
            System.out.println("The values are not valid");
    }

}
