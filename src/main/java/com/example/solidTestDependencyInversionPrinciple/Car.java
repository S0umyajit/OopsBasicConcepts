package com.example.solidTestDependencyInversionPrinciple;

public class Car {
    Engine engine;
    Car(Engine engine){
        this.engine=engine;
    }
    public void start(){
        engine.start();
    }
}
