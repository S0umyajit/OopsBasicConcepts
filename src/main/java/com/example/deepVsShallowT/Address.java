package com.example.deepVsShallowT;

public class Address implements Cloneable {

    public String city;

    public Address(String city) {
        this.city = city;
    }

    public Object clone(){
        Address address = null;

        try{
            address=(Address) super.clone();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return address;
    }
    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                '}';
    }
}
