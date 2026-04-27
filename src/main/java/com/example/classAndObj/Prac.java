package com.example.classAndObj;
class OuterClass{

    static class InnerClass{
        public void printRes(){
            System.out.println("hello from Inner class");
        }
    }
}
public class Prac {
    public static void main(String[] args) {
        OuterClass.InnerClass innerClass=new OuterClass.InnerClass();
        innerClass.printRes();
    }
}
