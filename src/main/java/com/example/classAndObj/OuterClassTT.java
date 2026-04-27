package com.example.classAndObj;

/**
 * This is an example for local Inner class
 */
public class OuterClassTT {

    public void myMeth(){
        class InnerClass{

            public void innerMeth(){
                System.out.println("Hi from inner meth");
            }
        }
        InnerClass innerClass=new InnerClass();
       innerClass.innerMeth();
    }
    public static void main(String[] args) {
        OuterClassTT outerClassTT=new OuterClassTT();
        outerClassTT.myMeth();
    }
}
