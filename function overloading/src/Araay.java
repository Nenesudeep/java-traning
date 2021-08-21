import java.util.ArrayList;
import java.util.Arrays;;

// array initialisation and

public class Araay {

        public static void main(String[] args){

            ArrayList<String> cars = new ArrayList<String>();
            cars.add("BMW");
            cars.add("Ferrai");
            cars.add("Pagani");
            System.out.println(cars);

            cars.set(1, "SUPER FERRARI");
            System.out.println(cars.get(2));
            cars.add("Tesla");
            System.out.println(cars);


            // 2D Arrays..

            int [][] two_d = {{2,4}, {3,4},{4,3}};

            System.out.println(two_d); // This will give the address of the array location.

            // to print the elements we need to write loop..

            for(int i=0; i<3; i++){

                for (int j=0; j<2; j++){

                    System.out.print(+two_d[i][j]+" ");
                    System.out.print(" ");
                }
                System.out.println("********** ");
            }

            int[][] inputArray = { { 3, 2, 3, 6 }, { 2, 4 }, { 9 }, { 2, 3, 4, 2 } };
            int total = 1;

            for (int i = 0; i < inputArray.length; i++) {
                for (int j = 1; j < inputArray[i].length - 1; j++) { //***first and last element are being skipped****
                //    System.out.print(inputArray[i][j]+" ");
                }
            }
           // System.out.println("Result = " + total);

            int[][] bus = {{1,2,3,7,7},{1,3,4}};
            for (int i=0; i<2; i++) {

                                // this is the lenght of the array{1,2,3,7,7}
                for (int j = 0; j < bus[i].length; j++) {

                    System.out.println(bus[i][j]);
                  //  System.out.println(bus[i].length);
                }
            }

        }

}
