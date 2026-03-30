package com.example.polymorphism;

abstract class Tt{
    void show(){
        System.out.println("Hello World");
    }

   abstract void display();
}
class Mm extends Tt{

    @Override
    void display() {
        System.out.println("hello from mm");
    }
    void show(){
        System.out.println("abcdef");
    }
}

public class OverRidingAndAbstraction {

    public static void main(String[] args) {
        Tt a=new Mm();
        a.show();
        a.display();
    }
}
