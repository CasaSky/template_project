package com.casasky.earth_ws.entity;


import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Earthling {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String name;

    // adjust jvm time units to postgres
    public ZonedDateTime bornTime = ZonedDateTime.now()
            .withZoneSameInstant(ZoneId.of("Europe/Berlin"))
            .truncatedTo(ChronoUnit.MICROS);


    public Earthling() {
    }


    public Earthling(String name) {
        this.name = name;
    }

}
