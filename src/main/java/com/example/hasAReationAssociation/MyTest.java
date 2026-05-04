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
    Address address;
//    Address address=new Address();
//    public void printDetails(){
//        System.out.println(age+" "+name);
//        address.printAddress();
//    }

    public Student(int age, String name, Address address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

}

public class MyTest {
    public static void main(String[] args) {
        Student s1=new Student(23,"Soumya",new Address());
//        s1=null;
        s1.address.printAddress();
    }
}
