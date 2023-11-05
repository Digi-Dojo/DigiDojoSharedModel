package it.unibz.digidojo.sharedmodel.event.startup;

import it.unibz.digidojo.sharedmodel.dto.StartupDTO;

public class StartupCreatedEvent extends StartupEvent {
    private static final String STARTUP_CREATED = "STARTUP_CREATED";

    public StartupCreatedEvent(StartupDTO startup) {
        super(STARTUP_CREATED, startup);
    }
}