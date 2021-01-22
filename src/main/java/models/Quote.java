package models;

public class Quote {
    private long id;
    private Author author;
    private String content;

    public Quote(){}

    public long getId(){
        return this.id;
    }

    public void setId(long id){
        this.id = id;
    }

    public Author getAuthor(){
        return this.author;
    }

    public void setAuthor(Author author){
        this.author = author;
    }

    public String getContent(){
        return this.content;
    }

    public void setContent(String content){
        this.content = content;
    }
}
