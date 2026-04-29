package com.example.abstractAndInterface;

public class Dog extends Mammal implements Animal{
    @Override
    public void sound() {
        System.out.println("Barkk!!!!!!!");
    }

    @Override
    void habitat() {
        System.out.println("Domestic Animal");
    }
}
