package com.example.solidtestWithSrp;

public class PrintInvoice {

    private ShoppingCart sp;
    PrintInvoice(ShoppingCart sp){
        this.sp=sp;
    }

    public void printInvoice(){
       for(Products p:sp.getProducts()){
           System.out.println(p.getName()+" "+p.getPrice());
       }
        System.out.println(sp.totalPrice());
    }
}
