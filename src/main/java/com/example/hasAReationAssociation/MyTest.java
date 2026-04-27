package com.example.hasAReationAssociation;

/**
 * Composition Example
 */
class Address{
    String city="Shanksahar";
    String state="WestBengal";

    public void printAddress(){
        System.out.println(city+"( "+state+" )");
    }
}
class Student{
    int age;
    String name;
    Address address=new Address();
    public void printDetails(){
        System.out.println(age+" "+name);
        address.printAddress();
    }
}

public class MyTest {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Soumyajit";
        s1.age=26;
        s1.printDetails();
    }
}
