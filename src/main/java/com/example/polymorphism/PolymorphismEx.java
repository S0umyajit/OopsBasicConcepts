package com.example.polymorphism;

class Prac{

    void show(String a){
        System.out.println("String method");
    }
    void show(StringBuffer a){
        System.out.println("String Buffer");
    }
}
public class PolymorphismEx {

    public static void main(String[] args) {
        Prac p=new Prac();
        p.show("abc");
        p.show(new StringBuffer("abc"));
        //As String and StringBuffer at the same level compiler confused which one to call
//        p.show(null);
    }
}
