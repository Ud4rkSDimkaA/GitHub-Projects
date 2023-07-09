package com.company;

import java.util.List;

public interface DBService<T extends User> {
    public T save();
    public List<T> getAll();
    public void delete();
}
