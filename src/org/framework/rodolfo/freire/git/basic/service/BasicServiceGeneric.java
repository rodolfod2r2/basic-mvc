package org.framework.rodolfo.freire.git.basic.service;


import org.framework.rodolfo.freire.git.basic.repository.BasicRepositoryGeneric;

import java.util.List;
import java.util.Optional;

public class BasicServiceGeneric<T, K> implements BasicService<T, K> {

    private final BasicRepositoryGeneric<T, K> repository = new BasicRepositoryGeneric<>();

    @Override
    public List<T> findAll() {
        System.out.println("List All in Service");
        return repository.findAll();
    }

    @Override
    public Optional<T> findById(K id) {
        System.out.println("List by ID in Service");
        return repository.findById(id);
    }

    @Override
    public T save(T entity) {
        System.out.println("Save in Service");
        return repository.save(entity);
    }

    @Override
    public T update(K id) {
        System.out.println("Update in Service");
        return repository.update(id);
    }

    @Override
    public void deleteById(K id) {
        System.out.println("Delete in Service");
        repository.deleteById(id);
    }
}
