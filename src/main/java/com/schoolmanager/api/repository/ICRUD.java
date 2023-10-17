package com.schoolmanager.api.repository;

import java.util.Set;

public interface ICRUD<T, ID> extends AutoCloseable{
    void insert(T obj);

    T readOne(ID id);

    Set<T> readAll();

    void update(T obj);

    void delete(ID id);
}
