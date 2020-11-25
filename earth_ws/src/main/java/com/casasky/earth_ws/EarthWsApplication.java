package com.casasky.earth_ws;


import com.casasky.core.config.SentryConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;


@Import({ SentryConfig.class })
@SpringBootApplication
public class EarthWsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EarthWsApplication.class, args);
    }

}
