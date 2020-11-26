package com.casasky.core.config;


import javax.annotation.PostConstruct;

import io.sentry.Sentry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.Strings;


class SentryInitializer {

    private static final Logger LOG = LogManager.getLogger();

    private final String activeProfile;

    public SentryInitializer(String activeProfile) {
        this.activeProfile = activeProfile;
    }


    @PostConstruct
    private void init() {


        String dsn = System.getenv("log.sentry.dsn");

        if (Strings.isNotBlank(dsn)) {

            Sentry.init(options -> options.setDsn(dsn));

            Sentry.configureScope(scope -> {
                scope.setTag("version", "1.0");
                scope.setTag("webservice", "to be defined");
            });

            LOG.info("sentry initialized");

        }
        else {

            LOG.info("no sentry dsn is configured - running without sentry");

        }

    }

}
