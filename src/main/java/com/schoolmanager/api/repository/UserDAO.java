package com.schoolmanager.api.repository;

import com.schoolmanager.api.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;

public class UserDAO extends DefaultDAO<User, Integer>{
    public UserDAO(Connection connection, String table) {
        super(connection, table);
    }

    @Override
    public User convert(ResultSet resultSet) throws SQLException {
        return null;
    }


    @Override
    public void insert(User user) {

            String commandSQL = "INSERT INTO user " +
                    "VALUES(?,?,?,?,?);";
            try ( PreparedStatement statement = connection.prepareStatement(commandSQL) ){
                statement.setInt(1,user.getId());

                statement.setString(2,user.getName());

                statement.setInt(3,user.getAge());

                statement.setString(4,user.getPassword());

                statement.setString(5,user.getAddress());
                try {
                    statement.setInt(6, user.getType());
                } catch (NullPointerException e) {
                    statement.setNull(6,0);
                }
                statement.execute();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
    }

    @Override
    public void update(User obj) {

    }
}
