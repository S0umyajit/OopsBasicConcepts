package com.example.solidTestOpenClosePrincipleProblem;
public class SQLDatabase extends SaveToDb{
    SQLDatabase(ShoppingCart cart){
        super(cart);
    }
    @Override
    public void save() {
        System.out.println("Save to SQL db");
    }
}
