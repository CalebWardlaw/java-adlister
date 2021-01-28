package com.codeup.adlister.dao;
import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;
import com.codeup.adlister.dao.Config;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLUsersDao implements Users{
    private Connection connection = null;

    //connection to database
    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    //Need to implement Users methods


    @Override
    public User findByUsername(String username) {
        String query = "SELECT * FROM users WHERE username = ?";
        try {
            //What does this do?
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, username);
        } catch (SQLException e) {
            throw new RuntimeException("Error finding user");
        }
        return null;
    }

    @Override
    public Long insert(User user) {
        String query = "INSERT INTO users(username, email, password) VALUES (?, ?, ?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());
            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new user.", e);
        }
    }
}