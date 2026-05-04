package com.example.anonymousClass;

public class Test {

    public static void main(String[] args) {

        HelloW h=new HelloW() {
            @Override
            public void greet() {
                System.out.println("Hello World");
            }
        };
        h.greet();
    }
}
