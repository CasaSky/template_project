package com.casasky.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;


@Configuration
public class SentryConfig {

    @Bean
    public SentryInitializer sentryInitializer(WebserviceProperties webserviceProperties) {

         return new SentryInitializer(new SentryData(webserviceProperties.getName()));

    }

}
