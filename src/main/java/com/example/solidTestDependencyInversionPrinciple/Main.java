package com.example.solidTestDependencyInversionPrinciple;

/**
 * Dependency Inversion Principle
 */
public class Main {
    public static void main(String[] args) {
        RegularEngine regularEngine=new RegularEngine();
        TurboEngine turboEngine=new TurboEngine();
        Car c1=new Car(regularEngine);
        Car c2=new Car(turboEngine);
        c1.start();
        c2.start();

    }
}
