package com.example.constructor;
class Abc{

    int age;
    String name;
    Abc(int age,String name){
        this.name=name;
        this.age=age;
    }
   public String toString(){
        return name+" "+age;
    }
}
public class Practice {
    public static void main(String[] args) {
        Abc a=new Abc(11,"Soumya");
        System.out.println(a);
    }

}
