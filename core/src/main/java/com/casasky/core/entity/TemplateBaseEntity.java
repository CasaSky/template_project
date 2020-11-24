package com.casasky.core.entity;


import java.time.ZonedDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.casasky.core.util.TimeUtil;


@MappedSuperclass
public class TemplateBaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String name;

    public final ZonedDateTime bornTime = TimeUtil.now();


    protected TemplateBaseEntity() {
    }


    public TemplateBaseEntity(String name) {
        this.name = name;
    }

}
