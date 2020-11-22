package com.casasky.template_ws.entity;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class ExampleTest {

    @Test
    public void construct() {

        var example = new Example("test");
        assertThat(example).isEqualTo(example);

    }

}