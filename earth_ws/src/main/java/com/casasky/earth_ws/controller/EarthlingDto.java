package com.casasky.earth_ws.controller;

import com.casasky.earth_ws.entity.Earthling;

public class EarthlingDto {

    public String name;

    public Earthling entity() {

        return new Earthling(name);

    }

}
