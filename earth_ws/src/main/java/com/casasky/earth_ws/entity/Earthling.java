package com.casasky.earth_ws.entity;

import javax.persistence.Entity;

import com.casasky.core.entity.TemplateBaseEntity;


@Entity
public class Earthling extends TemplateBaseEntity {

    protected Earthling() {
    }


    public Earthling(String name) {
        super(name);
    }

}
