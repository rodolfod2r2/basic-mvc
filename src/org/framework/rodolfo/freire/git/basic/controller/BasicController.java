package org.framework.rodolfo.freire.git.basic.controller;

import java.util.List;
import java.util.Optional;

public interface BasicController<T, K> {

    List<T> findAll();

    Optional<T> findById(K id);

    T save(T entity);

    T update(K id);

    void deleteById(K id);
}