package it.unibz.digidojo.sharedmodel.event.startup;

import it.unibz.digidojo.sharedmodel.dto.StartupDTO;

public class StartupUpdatedEvent extends StartupEvent {
    private static final String STARTUP_UPDATED = "STARTUP_UPDATED";

    public StartupUpdatedEvent(StartupDTO startup) {
        super(STARTUP_UPDATED, startup);
    }
}