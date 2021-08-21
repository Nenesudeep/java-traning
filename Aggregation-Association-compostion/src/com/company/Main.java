package com.company;
import java.io.*;

// REFER GFG class FOR THE COments

// <<Engine Class>>
class Engine{

    // starting engine
    public void work(){

        System.out.println("Engine of car has been started::");

    }

}

final class Car{ // final classes cannot be inherited.

    // for a car to move we need a engine.

    private final Engine engine; // name of object can  be anything like engine and eng etc.

    // Creating constructor for the engine object is compulsory to initialize values
    Car(Engine engine) {
        this.engine = engine;
    }

    //car start moving by engine starting.

    public void move(){

        {
            engine.work();
            System.out.println("Car is Moving");
        }

    }
}

public class Main {

    public static void main(String[] args) {

        Engine engine = new Engine();


        Car c = new Car(engine);
        c.move();                 // accessing only through the objects

        // write your code here
    }
}
