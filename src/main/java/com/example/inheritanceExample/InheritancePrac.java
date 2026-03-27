package com.example.inheritanceExample;

class Animal {
    public void eat(){
        System.out.println("Animal is eating");
    }
}
//Is-A relationship -- Dog is a Animal
class Dog extends Animal{

}
public class InheritancePrac {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();
    }
}
