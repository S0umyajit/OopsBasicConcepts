package com.example.default2;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private int age;
    private List<Integer> grades = new ArrayList<>();

    // constructor to initialize name and age
    public Student(String name, int age) {
        // TODO: implement constructor
        this.name=name;
        this.age=age;
    }

    // public method to add a grade
    public void addGrade(int grade) {
        // TODO: implement this method
        if(grade>=0 && grade<=100)
            grades.add(grade);
    }

    // public method to calculate the average grade
    public double getAverageGrade() {
        // TODO: implement this method
        int sum=0;
        int size=grades.size();
        for(int grade:grades){
            sum+=grade;
        }

        return sum/size;
    }

    // public method to get the student details
    public String getDetails() {
        // TODO: implement this method

        return "Name:"+ name+", Age:"+ age+", Average Grade:"+ getAverageGrade();
    }
}

