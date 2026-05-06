package com.example.solidtestWithSrp;

public class SaveToDb {
    private ShoppingCart sp;
    SaveToDb(ShoppingCart sp){
        this.sp=sp;
    }
    public void saveToDb(){
        System.out.println("Saving to database");
    }
}
