package com.company;

public class Main {

    private int num ;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void demo(){

        this.setNum(40);
        System.out.println("Value of num in the demo method "+ getNum());
    }

    public static void main(String[] args) {
        new Main().demo();

        New n = new New();
        System.out.println(n.getM());
	// write your code here
    }


}

class New {

    private int m = 34;

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public New(){
            // Now defalut constructor will give the values of 34 whenver a deefault constrtuctor is called.

    }





}


