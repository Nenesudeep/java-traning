class Point {
// ASSINGMENT 3.
    private double xCoordinate;
    private double yCoordinate;


    public double getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public double getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public Point(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    double calculateDistance(){

        double x1 = xCoordinate;

        double y2 = yCoordinate;

        double d = Math.sqrt(Math.pow(x1,2)+Math.pow(y2,2)*1);

        return Math.round(d*100.0)/100.0;

    }
    // Overloading Method.
    double calculateDistance(Point point){

//        System.out.println(point.xCoordinate); // this is taking the values from the point2 second as thier values are still unused which we have passed in the method as point 2 in last line.
//        System.out.println(this.xCoordinate);  // this is taking the values of the x1 as we are passing the x1 and y1 values over here

        double x = this.xCoordinate;
        double x2 = point.xCoordinate;

        double y = this.yCoordinate;
        double y2 = point.yCoordinate;

        double distance = Math.sqrt(Math.pow(x2-x,2)+Math.pow(y2-y,2));


        return  Math.round(distance*100.0)/100.0;



    }
    /*
    public String toString(){
        return "Point\nxCoordinate: "+this.getxCoordinate()+"\nyCoordinate: "+this.getyCoordinate();
    }
    */


    //Implement your code here
}

class Triangle {

    private Point point1;
    private Point point2;
    private Point point3;






    public Triangle(){
        Point p1 = new Point(0,0);
        Point p2 = new Point(1,1);
        Point p3 = new Point(2,5);

        this.point1 = p1;
        this.point2 = p2;
        this.point3 = p3;
        // PARAMETER LESS CONSTUcTOeR;

    }

    public Triangle(Point point1, Point point2, Point point3) {

        this.point1=point1;
        this.point2=point2;
        this.point3=point3;

    }

    public Triangle(double point1XCoordinate, double point1YCoordinate, double point2XCoordinate, double point2YCoordinate, double point3XCoordinate, double point3YCoordinate){

        this.point1 = new Point(point1XCoordinate,point1YCoordinate);
        this.point2 = new Point(point2XCoordinate,point2YCoordinate);
        this.point3 = new Point(point3XCoordinate,point3YCoordinate);



    }

    

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public double calculatePerimeter() {

        double ab = this.point1.calculateDistance(this.point2);

        double bc = this.point2.calculateDistance(this.point3);

        double ca = this.point3.calculateDistance(this.point1);


        return Math.round((ab + bc + ca)*100.0)/100.0;



    }

    public double calculateArea() {

        double ab = this.point1.calculateDistance(this.point2);

        double bc = this.point2.calculateDistance(this.point3);

        double ca = this.point3.calculateDistance(this.point1);

        double semiPerimeter = (ab + bc + ca )/2;

        double area = semiPerimeter*(semiPerimeter-ab)*(semiPerimeter-bc)*(semiPerimeter-ca);

        return Math.round(Math.sqrt(area)*100.0)/100.0; //

    }
}





class Testerr {

    public static void main(String[] args) {
 //       Point point1 = new Point(3.5, 1.5);
////        Point point2 = new Point(6, 4);
//
//        System.out.println("Distance of point1 from origin is "+point1.calculateDistance());
//        System.out.println("Distance of point2 from origin is "+point2.calculateDistance());
//        System.out.println("Distance of point1 from point2 is "+point1.calculateDistance(point2)); // here  giving the point 2 is very much important to access it from the method

        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle(1, 2, 6, 5, 5, 1);
        Point point1 = new Point(2, 1);
        Point point2 = new Point(4, 4);
        Point point3 = new Point(9, 1);
        Triangle triangle3 = new Triangle(point1, point2, point3);
        System.out.println();

        System.out.println("Perimeter of triangle1 is "+triangle1.calculatePerimeter());
        System.out.println("Area of triangle1 is "+triangle1.calculateArea());

        System.out.println("Perimeter of triangle2 is "+triangle2.calculatePerimeter());
        System.out.println("Area of triangle2 is "+triangle2.calculateArea());

        System.out.println("Perimeter of triangle3 is "+triangle3.calculatePerimeter());
        System.out.println("Area of triangle3 is "+triangle3.calculateArea());


        //Create more objects for testing your code

    }
}
