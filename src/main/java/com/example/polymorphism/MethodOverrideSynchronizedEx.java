package com.example.polymorphism;
// Example of synchronized method can be overridden. Also a method can be converted to synchronized
//in child class that is also an example of overriding
class Test01{
    synchronized void show(){
        System.out.println("Hello world from parent");
    }
    void display(){
        System.out.println("this is the end from parent");
    }
}
class Test02 extends Test01{
    @Override
    synchronized void show() {
        System.out.println("Hello from child");
    }
    synchronized void display(){
        System.out.println("This is the end from child");
    }
}
public class MethodOverrideSynchronizedEx {
    public static void main(String[] args) {
        System.out.println("========================child class ===============================");
        Test02 a=new Test02();
        a.display();
        a.show();
        System.out.println("==========================Parent class ================================");
        Test01 b=new Test01();
        b.show();
        b.display();

    }
}
