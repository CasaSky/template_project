package com.casasky.core.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;


@Configuration
public class SentryConfig {

    @Bean
    public SentryInitializer sentryInitializer(Environment environment) {

        var activeProfiles = environment.getActiveProfiles();
        return new SentryInitializer(activeProfiles.length < 1 ? "default" : activeProfiles[0]);

    }

}
