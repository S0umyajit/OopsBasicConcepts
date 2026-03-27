package com.example.polymorphism;

class Practice{

    void show(int a){
        System.out.println("int method");
    }
    void show(String a){
        System.out.println("String method");
    }

}
public class AutoCompilePolyMorphEx {
    public static void main(String[] args) {
        Practice p=new Practice();
        p.show("abc");
        p.show('c'); //Auto compile char autocompiled to int
    }
}
