package com.example.inventory.data.repository;

import com.example.inventory.data.model.Dependency;

import java.util.ArrayList;
import java.util.List;

public class DependencyRepository {
    private List<Dependency> list;
    private static DependencyRepository repository;

    static {
        repository = new DependencyRepository();

    }
    private DependencyRepository() {
        this.list = new ArrayList<>();
        initialice();
    }

    private void initialice()
    {
        list.add(new Dependency("nombre","nombre corto","descripcion", "imagen"));
        list.add(new Dependency("nombre2","nombre corto","descripcion", "imagen"));
        list.add(new Dependency("nombre3","nombre corto","descripcion", "imagen"));
        list.add(new Dependency("nombre4","nombre corto","descripcion", "imagen"));
    }

    public static DependencyRepository getInstance()
    {
        return repository;
    }

    public List<Dependency> getList()
    {
        return list;
    }
}
