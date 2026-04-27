package com.example.classAndObj;
class OuterClass{

    public void callMe(){
        System.out.println("Hello from Outer");
    }
    static class InnerClass{
        public void printRes(){
            System.out.println("hello from Inner class");
            OuterClass outerClass=new OuterClass();
            outerClass.callMe();
        }
    }
}
public class Prac {
    public static void main(String[] args) {
        OuterClass.InnerClass innerClass=new OuterClass.InnerClass();
        innerClass.printRes();
    }
}
