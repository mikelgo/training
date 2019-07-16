package com.prodyna.training.injection.assisted;

import org.springframework.beans.factory.annotation.Autowired;

//@Component
public class Service {

    private Dao dao;

    public Service(@Autowired Dao dao) {
        this.dao = dao;
    }

    public Dao getDao() {
        return dao;
    }

    public void setDao(Dao dao) {
        this.dao = dao;
    }
}
