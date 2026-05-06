package com.example.solidTestOpenClosePrincipleProblem;
public class Main {
    public static void main(String[] args) {
        ShoppingCart sp=new ShoppingCart();
        sp.addProducts(new Products("Shampoo",200));
        sp.addProducts(new Products("Oil",233));

        PrintInvoice pi=new PrintInvoice(sp);
        pi.printInvoice();

        SaveToDb saveToSqlDb=new SQLDatabase(sp);
        saveToSqlDb.save();
        SaveToDb saveToMongoDb=new MonoDatabase(sp);
        saveToMongoDb.save();
    }
}
