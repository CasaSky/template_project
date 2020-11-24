package com.casasky.mars_ws.entity;


import javax.persistence.Entity;

import com.casasky.core.entity.TemplateBaseEntity;


@Entity
public class Marsianer extends TemplateBaseEntity {

    protected Marsianer() {
    }


    public Marsianer(String name) {
        super(name);
    }

}
