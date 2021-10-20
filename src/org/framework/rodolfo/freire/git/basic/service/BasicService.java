package org.framework.rodolfo.freire.git.basic.service;

import java.util.List;
import java.util.Optional;

public interface BasicService<T, K> {

    List<T> findAll();

    Optional<T> findById(K id);

    T save(T entity);

    T update(K id);

    void deleteById(K id);

}
