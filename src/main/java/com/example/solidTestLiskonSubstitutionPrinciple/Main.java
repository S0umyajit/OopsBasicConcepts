package com.example.solidTestLiskonSubstitutionPrinciple;

/**
 * Liskov Substitution Principle
 */
public class Main {

    public static void main(String[] args) {
        Bird bird=new Bird();
        bird.move();
    }

    public void makeAnimalMove(Animal animal){
        animal.move();
    }

}
