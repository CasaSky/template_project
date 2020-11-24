package com.casasky.mars_ws.entity;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;


class MarsianerTest {

    @Test
    void construct() {

        var name = "test";
        var marsianer = new Marsianer(name);
        assertThat(marsianer.name).isEqualTo(name);

    }

}