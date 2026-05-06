package com.example.solidTest;

import java.util.ArrayList;
public class Products {

    private String name;
    private int price;

    Products(String name,int price){
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

class ShoppingCart{
    private Products p;
    public ArrayList<Products> products=new ArrayList<>();

    public void addProduct(Products p){
        products.add(p);
    }

    public ArrayList<Products> getProducts(){
        return products;
    }

    double calTotal(){
        double total=0;

        for(Products p:products){
            total+=p.getPrice();
        }
        return total;
    }

    public void printInvoice(){
        for(Products p:products){
            System.out.println(p.getName()+" "+p.getPrice());
        }
        System.out.println(calTotal());
    }

    void saveToDb(){
        System.out.println("Saving to database");
    }
}
class Main{
    public static void main(String[] args) {
        ShoppingCart sp=new ShoppingCart();
        sp.addProduct(new Products("mobile",12000));
        sp.addProduct(new Products("Laptop",234));
        System.out.println(sp.getProducts());
        sp.printInvoice();
        sp.saveToDb();
    }
}
