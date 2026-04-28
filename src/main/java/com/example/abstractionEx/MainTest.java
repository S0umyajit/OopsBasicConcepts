package com.example.abstractionEx;

public class MainTest {
    public static void main(String[] args) {
        Car c=new Car("Alto",2022);
        System.out.println(c);
        c.startEngine();
    }
}
