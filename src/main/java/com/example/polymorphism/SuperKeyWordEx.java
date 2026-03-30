package com.example.polymorphism;
class Abcd{
    public void show(){
        System.out.println("hello world");
    }
}
class Xyza extends Abcd{
    @Override
    public void show() {
        super.show(); //calling the super class method which will print hello world
        System.out.println("Bye world");
    }
}
public class SuperKeyWordEx {

    public static void main(String[] args) {
        Xyza a=new Xyza();
        a.show();
    }
}
