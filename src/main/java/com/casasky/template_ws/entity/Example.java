package com.casasky.template_ws.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;


@Entity
public class Example {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String name;

    // adjust jvm time units to postgres
    public ZonedDateTime creationTime = ZonedDateTime.now()
            .withZoneSameInstant(ZoneId.of("Europe/Berlin"))
            .truncatedTo(ChronoUnit.MICROS);

    public Example() {
    }

    public Example(String name) {
        this.name = name;
    }

}
