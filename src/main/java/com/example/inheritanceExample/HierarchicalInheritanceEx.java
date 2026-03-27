package com.example.inheritanceExample;
class A2{
    public void showA(){
        System.out.println("A2 class method");
    }
}
class B2 extends A2{
    public void showB(){
        System.out.println("B2 class method");
    }
}
class C2 extends A2{
    public void showC(){
        System.out.println("C2 class method");
    }
}
public class HierarchicalInheritanceEx {
    public static void main(String[] args) {
        System.out.println("========================Hierarchical Inheritance=======================");
        A2 obj1=new A2();
        System.out.println("======================= A2 class========================");
        obj1.showA();

        B2 obj2=new B2();
        System.out.println("======================= B2 class========================");
        obj2.showA();
        obj2.showB();

        C2 obj3=new C2();
        System.out.println("======================= C2 class========================");
        obj3.showA();
        obj3.showC();


    }
}
