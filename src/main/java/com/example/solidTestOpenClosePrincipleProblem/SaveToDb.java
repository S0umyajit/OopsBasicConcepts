package com.example.solidTestOpenClosePrincipleProblem;
public class SaveToDb {
    private ShoppingCart sp;
    SaveToDb(ShoppingCart sp){
        this.sp=sp;
    }
    public void saveToSQLDB(){

        System.out.println("Saving to SQL Database");
    }
    public void saveToMongoDb(){
        System.out.println("Saving to Mongo Database");
    }
    public void saveToFile(){
        System.out.println("Saving to the file");
    }
}
