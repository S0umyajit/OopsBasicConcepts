package com.example.abstractionEx;

public abstract class Vehicle {

    String model;
    int year;
    String type;

    public Vehicle(String model, int year, String type) {
        this.model = model;
        this.year = year;
        this.type = type;
    }

    public abstract void startEngine();
}
