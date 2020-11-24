package com.casasky.earth_ws.service;


import static org.assertj.core.api.Assertions.assertThat;

import com.casasky.core.service.BaseIntegrationTest;
import com.casasky.earth_ws.entity.Earthling;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


class EarthlingServiceIntegrationTest extends BaseIntegrationTest {

    @Autowired
    private EarthlingService earthlingService;


    @Test
    void testPersist() {

        var earthling = new Earthling("test");
        earthlingService.persist(earthling);

        var earthlings = earthlingService.findAll(Earthling.class);
        assertThat(earthlings).isNotEmpty();
        assertThat(earthlings.get(0)).usingRecursiveComparison().isEqualTo(earthling);

    }

}