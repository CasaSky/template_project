package com.casasky.mars_ws;


import com.casasky.core.config.BasicConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;


@Import({ BasicConfig.class })
@SpringBootApplication
public class MarsWsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarsWsApplication.class, args);
    }

}
