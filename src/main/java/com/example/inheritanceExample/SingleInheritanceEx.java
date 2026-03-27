package com.example.inheritanceExample;
class A{
    public void showA(){
        System.out.println("A class method");
    }
}
class B extends A{
    public void showB(){
        System.out.println("B class method");
    }
}
public class SingleInheritanceEx {

    public static void main(String[] args) {
        A obj1=new A();
        obj1.showA();
        B obj2=new B();
        obj2.showB();
        obj2.showA();
    }

}
