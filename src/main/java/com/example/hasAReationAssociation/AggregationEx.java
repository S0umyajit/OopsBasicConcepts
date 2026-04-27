package com.example.hasAReationAssociation;

/**
 * Aggregation Example
 */

class Car{
    String model;
    public MusicPlayer musicPlayer;

    Car(String model, MusicPlayer musicPlayer){
        this.model=model;
        this.musicPlayer=musicPlayer;
    }

    public void journeyStart(){
        System.out.println(model+" "+musicPlayer.brand);
        musicPlayer.playMusic();
    }
}

class MusicPlayer{

    String brand;

    MusicPlayer(String brand){
        this.brand=brand;
    }

    public void playMusic(){
        System.out.println("Music Play");
    }
}
public class AggregationEx {
    public static void main(String[] args) {
        MusicPlayer sony=new MusicPlayer("Sony");
        Car c=new Car("Thar",sony);
        c.journeyStart();
    }

}
