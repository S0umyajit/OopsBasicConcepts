package com.example.shallowCopyvsDeepCopy;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {

        User user1=new User("Soumya",new Address("Kolkata", "West Bengal"),101);
        User user2= (User) user1.clone();
//        user2.address.city="Bhangore";
        user2.setAddress(new Address("Bangalore","Karnataka"));
        System.out.println("user1: "+user1);
        System.out.println("user2: "+user2);
    }
}
