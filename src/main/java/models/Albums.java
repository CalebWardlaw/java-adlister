package models;

import java.io.Serializable;
import java.util.Date;

//Do I need the Ser. implementation?

public class Albums implements Serializable {

    private int id;
    private String artist;
    private String name;
    private Date releaseDate;
    private Long sales;
    private String genre;

    public Albums(){}

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



    public Date getReleaseDate(){
        return this.releaseDate;
    }

    public void setReleaseDate(Date releaseDate){
        this.releaseDate = releaseDate;
    }


    public Long getSales(){
        return this.sales;
    }

    public void setSales(Long sales){
        this.sales = sales;
    }



    public String getGenre(){
        return this.genre;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

}