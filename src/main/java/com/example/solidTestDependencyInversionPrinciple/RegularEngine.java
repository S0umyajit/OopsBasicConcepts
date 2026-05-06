package com.example.solidTestDependencyInversionPrinciple;

public class RegularEngine implements Engine{
    @Override
    public void start(){
        System.out.println("regular engine starts");
    }
}
