package com.casasky.mars_ws.service;


import static org.assertj.core.api.Assertions.assertThat;

import com.casasky.core.service.BaseIntegrationTest;
import com.casasky.mars_ws.entity.Marsianer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


class MarsServiceIntegrationTest extends BaseIntegrationTest {

    @Autowired
    private MarsianerService marsianerService;


    @Test
    void testPersist() {

        var marsianer = new Marsianer("test");
        marsianerService.persist(marsianer);

        var earthlings = marsianerService.findAll(Marsianer.class);
        assertThat(earthlings).isNotEmpty();
        assertThat(earthlings.get(0)).usingRecursiveComparison().isEqualTo(marsianer);

    }

}