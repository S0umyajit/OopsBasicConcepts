package com.example.interfacePrac;

public interface Car {

    void start();

    void stop();
    default void blowHorn(){
        System.out.println("Pip Pip");
    }

    static void fullSpeed(){
        System.out.println("Go Fast");
    }
}
