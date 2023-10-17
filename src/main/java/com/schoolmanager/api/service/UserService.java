package com.schoolmanager.api.service;

import com.schoolmanager.api.model.User;
import com.schoolmanager.api.repository.ICRUD;

import java.sql.Connection;
import java.util.Set;

public class UserService implements ICRUD<User, Integer> {
    protected Connection connection;
    protected String comandoSQL;
    private String table;

    @Override
    public void inserir(User obj) {

    }

    @Override
    public User buscarUm(Integer integer) {
        return null;
    }

    @Override
    public Set<User> buscarTodos() {
        return null;
    }

    @Override
    public void atualizar(User obj) {

    }

    @Override
    public void deletar(Integer integer) {

    }

    @Override
    public void close() throws Exception {

    }
}
