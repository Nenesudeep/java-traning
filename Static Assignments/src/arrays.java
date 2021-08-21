import java.util.Scanner;

public class arrays {
    // MY PRAcTICE..




    public static void main(String[] args){

        int [] numbers = {15544, 54654,56564,65446,64665};

        Scanner Object = new Scanner(System.in);

        int modellId = Object.nextInt(); // enter the model number

        int modelRegNo=0;

        while (modellId>10){ // this loop prints the first number of the provided number.

             modellId = modellId/10;

             modelRegNo = modellId;
        }

        System.out.println(modelRegNo);

        int max = numbers[modelRegNo];
        int min = numbers[modelRegNo-1];

        System.out.println("Max"+max);
        System.out.println("Min"+min);






        }
}
