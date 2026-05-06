package com.example.solidTestOpenClosePrincipleProblem;
public abstract class SaveToDb {
    private ShoppingCart sp;
    SaveToDb(ShoppingCart sp){
        this.sp=sp;
    }
    public abstract void save();
}
