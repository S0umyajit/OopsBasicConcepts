package com.example.inheritanceExample;
//Metho overload to achieve Polymorphism
class Test{
    void show(){
        System.out.println("Hello");
    }
    void show(int a,String b){
        System.out.println("World: "+a+" "+b);
    }
    void show(String b,int a){
        System.out.println("Bye"+b+" "+a);
    }
    void show(int i){
        System.out.println(i);
    }
}

public class PolyMorphismCompileTimeEx {
    public static void main(String[] args) {

        Test t=new Test();
        t.show();
        t.show(12);
        t.show(12,"eeeee");
        t.show("iiii",13);
    }
}
