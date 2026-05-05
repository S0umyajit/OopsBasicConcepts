package com.example.advancePoly;

public class Employee extends Person{

    private String empId;
    public Employee(String name, Address address,String empId) {
        super(name, address);
        this.empId=empId;
    }

    public String getEmpId(){
        return empId;
    }
}
