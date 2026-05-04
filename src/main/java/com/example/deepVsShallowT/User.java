package com.example.deepVsShallowT;

public class User implements Cloneable {

    public String name;
    public Address address;

    public User(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public Object clone() {
        User user = null;
        try{
            user=(User)super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        address=(Address) this.address.clone();
        return user;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
