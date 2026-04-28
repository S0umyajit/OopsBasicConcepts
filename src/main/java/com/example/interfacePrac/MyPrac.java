package com.example.interfacePrac;

public class MyPrac implements ElectricCar{
    @Override
    public void charge() {
        System.out.println("Charging");
    }

    @Override
    public void start() {
        System.out.println("Starting!!!!");
    }

    @Override
    public void stop() {
        System.out.println("Stopping!!!!");
    }

    /**
     * Default method can be overridden
     */
    public void blowHorn(){
        System.out.println("Ti tittt");
    }

    public static void main(String[] args) {

        MyPrac tesla=new MyPrac();
        tesla.start();
        tesla.stop();
        tesla.blowHorn();
        Car.fullSpeed(); //calling the static method from interface
    }
}
