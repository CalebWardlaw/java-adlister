package models;

import java.io.Serializable;

public class Quotes implements Serializable {

    private String author_first_name;
    private String author_last_name;
    private String content;

    public Quotes(){}

    public String getAuthorFirstName(){
        return author_first_name;
    }

    public void setAuthorFirstName(String author_first_name){
        this.author_first_name = author_first_name;
    }

    public String getAuthorLastName(){
        return author_last_name;
    }

    public void setAuthorLastName(String author_last_name){
        this.author_last_name = author_last_name;
    }

    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }
}
