package org.framework.rodolfo.freire.git.basic.repository;

import java.util.List;
import java.util.Optional;

public class BasicRepositoryGeneric<T, K> implements BasicRepository<T, K> {

    @Override
    public List<T> findAll() {
        System.out.println("List All in Repository");
        return null;
    }

    @Override
    public Optional<T> findById(K id) {
        System.out.println("List by ID in Repository");
        return Optional.empty();
    }

    @Override
    public T save(T entity) {
        System.out.println("Save in Repository");
        return null;
    }

    @Override
    public T update(K id) {
        System.out.println("Update in Repository");
        return null;
    }

    @Override
    public void deleteById(K id) {
        System.out.println("Delete in Repository");
    }
}
