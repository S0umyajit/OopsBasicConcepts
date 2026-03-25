package org.example;
class Animal{
    String name;
    int age;

    void initializeObj(String n,int i){
        name=n;
        age=i;
    }
    void display(){
        System.out.println(name+" "+age);
    }


}
public class OOpsConceptClassObj {

    public static void main(String[] args) {
        Animal dog=new Animal();
        dog.initializeObj("Buzo",12);
        dog.display();
    }
}
