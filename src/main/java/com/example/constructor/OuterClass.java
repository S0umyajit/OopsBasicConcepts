package com.example.constructor;

public class OuterClass {

    static class StaticNestedClass {
        public void printMessage() {
            System.out.println("Hello from the static nested class");
        }
    }

    class InnerClass {
        public void printMessage() {
            System.out.println("Hello from the inner class");
        }
    }

    public void displayLocalClassMessage() {
        class LocalInnerClass {
            public void printMessage() {
                System.out.println("Hello from the local inner class");
            }
        }

        LocalInnerClass localInnerClass=new LocalInnerClass();
        localInnerClass.printMessage();

        // TODO: Instantiate the local inner class and call its printMessage method
    }

    public static void main(String[] args) {
        // TODO: Instantiate the static nested class and call its printMessage method
        OuterClass.StaticNestedClass staticNestedClass=new OuterClass.StaticNestedClass();
        staticNestedClass.printMessage();

        // TODO: Instantiate the outer class, then instantiate the inner class and call its printMessage method

        OuterClass outerClass=new OuterClass();
        OuterClass.InnerClass innerClass=outerClass.new InnerClass();
        innerClass.printMessage();

        // TODO: Call the displayLocalClassMessage method that displays the message from the local inner class
        outerClass.displayLocalClassMessage();
    }
}

