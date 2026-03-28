package com.example.polymorphism;

class Abc{
    public void show(){
        System.out.println("Meow");
    }
}

class Xyz extends Abc{

    public void show(){
        System.out.println("Bhow");
    }
}

public class RunTimePolyEx {

    public static void main(String[] args) {

        Abc a=new Xyz();
        a.show();
    }
}
