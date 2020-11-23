package com.casasky.template_ws.service;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.casasky.template_ws.entity.Example;



class ExampleServiceIntegrationTest extends BaseIntegrationTest {

    @Autowired
    private ExampleService exampleService;

    @Test
    void testPersist() {

        var example = new Example("test");
        exampleService.persist(example);

        var examples = exampleService.findAll();
        assertThat(examples).isNotEmpty();
        assertThat(examples.get(0)).usingRecursiveComparison().isEqualTo(example);

    }

}