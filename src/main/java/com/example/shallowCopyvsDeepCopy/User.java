package com.example.shallowCopyvsDeepCopy;

public class User implements Cloneable{
    public String name;
    public int rollNo;
    public Address address;

    public User(String name, Address address, int rollNo) {
        this.name = name;
        this.address = address;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", address=" + address +
                '}';
    }

    public Object clone() throws CloneNotSupportedException{

        User user=null;

        try{
            user=(User) super.clone();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        user.address=(Address) this.address.clone();
        return user;
    }
}
