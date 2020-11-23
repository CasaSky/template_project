package com.casasky.earth_ws.entity;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;


class EarthlingTest {

    @Test
    void construct() {

        var name = "test";
        var earthling = new Earthling(name);
        assertThat(earthling.name).isEqualTo(name);

    }

}