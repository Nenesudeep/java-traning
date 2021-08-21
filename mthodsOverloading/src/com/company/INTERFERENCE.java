package com.company;

// interface is just like abstract class we cannot make object from interface or abstract class
// Used for concept of abstraction so that user do not get the details of the what is happening behind the scenes
interface FirstInterface{

    public void myMethod(); // interface Method

}
// implements is used instead of extends .
class DemoClass implements FirstInterface{


    public void myMethod() {
                    System.out.println("Some Txt...");
    }

    public int newM(int x,int y){

        System.out.println("SSs");
        return x*y;
    }
}



class INTERFERENCE{

    public static void main(String[] args){

        DemoClass D = new DemoClass();
        D.myMethod();
        System.out.println(D.newM(5,6));  // TO display the method we need to write print method.

    }


}