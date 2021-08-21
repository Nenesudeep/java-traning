import java.util.Objects;
import java.util.Scanner;

 class CabServiceProvider{
        private String cabServiceName;
        private int totalCabs;
//        private double bonus;

     public CabServiceProvider(String cabServiceName, int totalCabs) {

            this.cabServiceName=cabServiceName;
            this.totalCabs=totalCabs;

        }

    public CabServiceProvider(){

    }
        // Here driver class oject is beign used as function method parameter.
        double calculateRewardPrice(Driver driver) {

            // using d objet of the driver
            float x = driver.getAverageRating();

            if (Objects.equals(cabServiceName, "Halo")) {


                if (x >= 4.5 && x <= 5) {

                    return 10 * x;

                }

                if (x >= 4 && x < 4.5) {

                    return 5 * x;

                } else
                    return 0;
            }
            if (Objects.equals(cabServiceName, "Aber")) {

//                float y = driver.getAverageRating();
//
                if (x >= 4.5 && x<= 5) {

                    return 8 * x;
                }
                if (x >= 4 && x < 4.5) {

                    return 3 * x;
//

                }


            }

                return 0;

        }


        public String getCabServiceName() {
            return cabServiceName;
        }

        public void setCabServiceName(String cabServiceName) {
            this.cabServiceName = cabServiceName;
        }

        public int getTotalCabs() {
            return totalCabs;
        }

        public void setTotalCabs(int totalCabs) {
            this.totalCabs = totalCabs;
        }
    }

    class Driver {

        private String driverName;
        private float averageRating;

        public Driver(String driverName, float averageRating){
            this.driverName=driverName;
            this.averageRating=averageRating;
        }

        public String getDriverName(){
            return this.driverName;
        }

        public void setDriverName(String driverName){
            this.driverName=driverName;
        }

        public float getAverageRating(){
            return this.averageRating;
        }

        public void setAverageRating(float averageRating){
            this.averageRating=averageRating;
        }

        //DO NOT MODIFY THE METHOD
        //Your exercise might not be verified if the below method is modified
        public String toString(){
            return "Driver\ndriverName: "+this.driverName+"\naverageRating: "+this.averageRating;
        }
    }

class Exercise {

        public static void main(String[] args){
            CabServiceProvider cabServiceProvider1 = new CabServiceProvider("Halo", 50);

            Driver driver1 = new Driver("Luke", 4.8f);
            Driver driver2 = new Driver("Mark", 4.2f);
            Driver driver3 = new Driver("David", 3.9f);

            CabServiceProvider cabServiceProvider2 = new CabServiceProvider("Aber",50); // Aber case.

            Driver driver4 = new Driver("tom",4.6f);
            System.out.println(new CabServiceProvider().calculateRewardPrice(driver4));
            Driver[] driversList = { driver1, driver2, driver3, driver4 };
            for (Driver driver : driversList) {
                System.out.println("Driver Name: "+driver.getDriverName());
                double bonus = cabServiceProvider1.calculateRewardPrice(driver);
                if (bonus>0)
                    System.out.println("Bonus: $"+bonus+"\n");
                else
                    System.out.println("Sorry, bonus is not available!");
            }

            //Create more objects of CabServiceProvider and Driver classes for testing your code
        }
    }



