package com.example.polymorphism;
//This is also example of RunTimePolymorphism, as this is an example of covariant
class MyTess {
    Object show() {
        return "hello";
    }
}

class MyTess2 extends MyTess{
    String show(){
        return "Bye";
    }
}
public class CovariantExPoly {

    public static void main(String[] args) {
        MyTess2 m=new MyTess2();
        System.out.println(m.show());
    }
}
