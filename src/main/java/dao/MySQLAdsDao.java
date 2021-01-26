package dao;


import com.mysql.cj.jdbc.Driver;
import models.Ad;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class MySQLAdsDao implements Ads  {
    private Connection connection = null;

    public MySQLAdsDao(Config config){
        try{
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        }catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!");
        }
    }

    @Override
    public List<Ad> all() {
        return null;
    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }
}
