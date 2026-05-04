package com.example.memberInnerClass;

public class Car {

    String model;
    boolean isEngineOn;

    Car(String model){
        this.model=model;
        isEngineOn=false;
    }

    class Engine{

        public void start(){

            if(!isEngineOn){
                isEngineOn=true;
                System.out.println("Engine Started");
            }
            else{
                System.out.println("Already started");
            }
        }
        public void stop(){

            if(isEngineOn){
                isEngineOn=false;
                System.out.println("Engine Stopped");
            }
            else{
                System.out.println("Already Stopped");
            }
        }
    }

    public static void main(String[] args) {
        Car car=new Car("TATA SAFARI");
        Car.Engine c=car.new Engine();
        c.start();
        c.start();
        c.stop();
        c.stop();
    }
}
