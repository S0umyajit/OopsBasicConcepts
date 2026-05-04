package com.example.deepVsShallowT;

public class Test {

    public static void main(String[] args) {

        User user1=new User("Soumya",new Address("Shanksahar"));
        System.out.println("Before changing");
        User user2=(User)user1.clone();
        System.out.println(user1);
        System.out.println(user2);

        user2.address.city="Bhangore";
        System.out.println("After changing");
        System.out.println(user1);
        System.out.println(user2);

    }
}
