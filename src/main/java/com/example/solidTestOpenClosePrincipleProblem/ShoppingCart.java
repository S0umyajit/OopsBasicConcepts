package com.example.solidTestOpenClosePrincipleProblem;
import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<Products> products=new ArrayList<>();

    public ArrayList<Products> getProducts() {
        return products;
    }

    public void addProducts(Products p) {
        products.add(p);
    }

    public double totalPrice(){
        double total=0;

        for(Products p:products){
            total+=p.getPrice();
        }
        return total;
    }
}
