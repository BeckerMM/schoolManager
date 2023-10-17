package com.schoolmanager.api.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

public abstract class DefaultDAO<T,ID>  implements ICRUD<T,Integer> {
    protected Connection connection;
    protected String commandSQL;
    private String table;

    public DefaultDAO(Connection connection, String table) {
        this.connection = connection;
        this.table = table;
    }

    @Override
    public void close() throws Exception {
        this.connection.close();
    }

    public Set<T> readAll() {
        commandSQL = "SELECT * FROM "+table+";";
        try {
            PreparedStatement statement = connection.prepareStatement(commandSQL);
            ResultSet resultSet = statement.executeQuery();

            Set<T> lista = new HashSet<>();
            while (resultSet.next()) {
                lista.add(convert(resultSet));
            }
            return lista;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public T readOne(Integer id){
        commandSQL = "SELECT * FROM "+table+" WHERE id = ?";
        try(PreparedStatement statement = connection.prepareStatement(commandSQL)) {
            statement.setInt(1,  id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()){
                return convert(resultSet);
            }
            throw new NoSuchElementException();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void delete(Integer id) {
        commandSQL = "DELETE FROM "+table+" WHERE id = ?;";
        try {
            PreparedStatement statement = connection.prepareStatement(commandSQL);
            statement.setInt(1, id);
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



    public abstract T convert(ResultSet resultSet) throws SQLException;

}