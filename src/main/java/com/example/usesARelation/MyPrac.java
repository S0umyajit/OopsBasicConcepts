package com.example.usesARelation;

class Printer{
    public void print(String content){
        System.out.println(content+" printing");
    }
}
class OfficeWorker{
    String name;
    OfficeWorker(String name){
        this.name=name;
    }
    OfficeWorker(Printer printer){
        String content="Xerox";
        printer.print(content);
    }
    public void doPrint(){
        Printer p=new Printer();
        System.out.println(name+" started printing machine");
        p.print("Normal");
    }
}
public class MyPrac {
    public static void main(String[] args) {
        Printer p=new Printer();
        OfficeWorker officeWorker=new OfficeWorker(p);
        officeWorker.name="Soumyajit";
        officeWorker.doPrint();
    }
}
