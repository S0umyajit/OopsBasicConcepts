package com.example.constructorEx;

public class Testt {

    int age;
    String name;

    Testt(){
        this(0,null); // calling the parameterized constructor; constructor chain
    }

    Testt(int age,String name){
        this.age=age;
        this.name=name;
    }

    public void printM(){
        System.out.println(age+" "+name);
    }
    public static void main(String[] args) {
        Testt t=new Testt();
        t.printM();
    }
}
