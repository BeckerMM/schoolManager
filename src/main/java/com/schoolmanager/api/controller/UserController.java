package com.schoolmanager.api.controller;

import com.schoolmanager.api.model.User;
import com.schoolmanager.api.repository.ICRUD;

import java.util.Set;

public class UserController implements ICRUD<User, Integer> {

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
