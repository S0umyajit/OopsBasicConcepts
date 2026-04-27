package com.example.classAndObj;

class OuterClassEx{
    class InnerClassExTT {
        public void testMe(){
            System.out.println("Hi from InnerClassEx testme Method");
        }
    }
}

public class InnerClassEx {
    public static void main(String[] args) {
        OuterClassEx outerClassEx=new OuterClassEx();
        OuterClassEx.InnerClassExTT innerClassExTT=outerClassEx.new InnerClassExTT();
        innerClassExTT.testMe();
    }
}
