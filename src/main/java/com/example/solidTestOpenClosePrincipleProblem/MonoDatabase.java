package com.example.solidTestOpenClosePrincipleProblem;
public class MonoDatabase extends SaveToDb {
    MonoDatabase(ShoppingCart sp) {
        super(sp);
    }
    @Override
    public void save() {
        System.out.println("Save to Mongo Database");
    }
}
