package com.casasky.core.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SentryConfig {

    @Bean
    public SentryInitializer sentryInitializer() {

        return new SentryInitializer();

    }

}
