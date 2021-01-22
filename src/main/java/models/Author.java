package models;

public class Author {

    private long id;
    private String firstName;
    private String lastName;

    public Author(){}

    public long getId(){
        return this.id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

}
