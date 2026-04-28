package com.example.abstractionEx;

public class Car extends Vehicle{
    public Car(String model, int year) {
        super(model, year, "Car");
    }

    @Override
    public void startEngine() {
        System.out.println("Engine is Starting");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", type='" + type + '\'' +
                '}';
    }
}
