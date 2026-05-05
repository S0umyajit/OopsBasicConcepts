package com.example.advancePoly;

public class AnimalShelter {

    public void makeAnimalSpeak(){

    Animal[] animals=new Animal[2];

    AnimalShelter animalShelter=new AnimalShelter();

    AnimalShelter.Dog dog=animalShelter.new Dog();

    animals[0]=dog;

    Animal a=new Animal() {
        @Override
        public void speak() {
            System.out.println("Meow");
        }
    };

    animals[1]=a;

    for(Animal aa:animals){
        aa.speak();
    }
    }
    abstract class Animal{
        public abstract void speak();
    }

    class Dog extends Animal{

        @Override
        public void speak() {
            System.out.println("Woof");
        }
    }
    public static void main(String[] args) {

        AnimalShelter as=new AnimalShelter();

        as.makeAnimalSpeak();

    }
}
