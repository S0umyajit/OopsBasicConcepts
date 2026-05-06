package com.example.solidTestDependencyInversionPrinciple;

public class TurboEngine implements Engine{
    @Override
    public void start(){
        System.out.println("Turbo engine starts");
    }
}
