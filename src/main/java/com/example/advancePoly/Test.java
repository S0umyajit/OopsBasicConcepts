package com.example.advancePoly;

public class Test {
    public static void main(String[] args) {
        Employee e=new Employee("Soumya",new Address("Shanksahar","Shanksahar Pal Para"),"1");

        System.out.println(e.getEmpId());
        System.out.println(e.getName());
        System.out.println(e.getAddress());
    }
}
