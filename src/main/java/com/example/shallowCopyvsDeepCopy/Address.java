package com.example.shallowCopyvsDeepCopy;

public class Address implements Cloneable{

    public String city;
    public String state;

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

//    public Object clone() throws CloneNotSupportedException{
//
//        Address addr=null;
//
//        try{
//            addr= (Address) super.clone();
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//        return addr;
//    }
}
