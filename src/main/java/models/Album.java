package models;

import java.io.Serializable;
import java.util.Date;

//Do I need the Ser. implementation?

public class Album implements Serializable {

    private int id;
    private String artist;
    private String name;
    private int releaseDate;
    private double sales;
    private String genre;

    public Album(){}

//    Not necessary due to SQL auto incrementing

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }



    public String getArtist(){
        return this.artist;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }



    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }



    public int getReleaseDate(){
        return this.releaseDate;
    }

    public void setReleaseDate(int releaseDate){
        this.releaseDate = releaseDate;
    }


    public double getSales(){
        return this.sales;
    }

    public void setSales(double sales){
        this.sales = sales;
    }



    public String getGenre(){
        return this.genre;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

}