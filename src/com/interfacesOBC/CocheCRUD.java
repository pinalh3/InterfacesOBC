package com.interfacesOBC;

import java.util.List;

public interface CocheCRUD {

    void save();

    List<Object> findAll();

    void delete();
}
