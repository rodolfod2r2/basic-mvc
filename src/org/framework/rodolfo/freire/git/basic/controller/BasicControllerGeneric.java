package org.framework.rodolfo.freire.git.basic.controller;


import org.framework.rodolfo.freire.git.basic.service.BasicServiceGeneric;

import java.util.List;
import java.util.Optional;

public class BasicControllerGeneric<T, K> implements BasicController<T, K> {

    private final BasicServiceGeneric<T, K> service = new BasicServiceGeneric<>();

    @Override
    public List<T> findAll() {
        System.out.println("List All in Controller");
        return service.findAll();
    }

    @Override
    public Optional<T> findById(K id) {
        System.out.println("List by ID in Controller");
        return service.findById(id);
    }

    @Override
    public T save(T entity) {
        System.out.println("Save in Controller");
        return service.save(entity);
    }

    @Override
    public T update(K id) {
        System.out.println("Update in Controller");
        return service.update(id);
    }

    @Override
    public void deleteById(K id) {
        System.out.println("Delete in Controller");
        service.deleteById(id);
    }
}
