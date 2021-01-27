package dao;//Will I need to swap the returns?

class Config {
    //Swap to db I'd like to use
    public String getUrl() {
        return "jdbc:mysql://localhost/adlister_db?serverTimezone=UTC&useSSL=false";
    }
    //Using root to access
    public String getUser() {
        return "root";
    }

    public String getPassword() {
        return "codeup";
    }
}