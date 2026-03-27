package com.example.inheritanceExample;

class A1{
    public void showA(){
        System.out.println("A class method");
    }
}
class B1 extends A1{
    public void showB(){
        System.out.println("B class method");
    }
}
class C1 extends B1{
    public void showC(){
        System.out.println("C class method");
    }
}
//multilevel
// A -> B -> C
// there are mainly three types of inheritance is there in Java
// Single, MultiLevel and Hierarchical
public class MultiLevelInheritance {
    public static void main(String[] args) {
        A1 obj1=new A1();
        System.out.println("=====================For class A1======================");
        obj1.showA();
        B1 obj2=new B1();
        System.out.println("====================For class B1========================");
        obj2.showB();
        obj2.showA();
        C1 obj3=new C1();
        System.out.println("=====================For class C1=====================");
        obj3.showC();
        obj3.showB();
        obj3.showA();
    }
}
