package com.company;

public class Object_Methods {

    private double re, im;

    public Object_Methods(double re, double im){// constructor parametrized

        this.re=re;
        this.im=im;
    }

    public double getRe() {
        return re;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public double getIm() {
        return im;
    }

    public void setIm(double im) {
        this.im = im;
    }

    @Override // here overriding is happening
    public String toString() {

       // return String.valueOf(re +" i "+ im);// this will print the both values if we print the object of this class. removing this will create a error.

        // these both statements will print the value of the string that is being passed to constructor of the class.
        return String.format(re+"i"+im);

    }
}



class Testerr{

      public static void main(String [] args){

          Object_Methods m = new Object_Methods(20,23);

         // System.out.println(m.getIm()+m.getRe()); // One way is to use getter and setter methods

          System.out.println(m); // this will print the hashcode of the object.. which constant. if tostring method is not defined.

          // the other way to print these variables is toString method of the class.

      }

}
