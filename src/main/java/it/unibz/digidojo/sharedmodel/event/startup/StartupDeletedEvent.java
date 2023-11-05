package it.unibz.digidojo.sharedmodel.event.startup;

import it.unibz.digidojo.sharedmodel.event.BaseEvent;
import lombok.Getter;
import lombok.experimental.Accessors;

@Getter
@Accessors(fluent = true)
public class StartupDeletedEvent extends BaseEvent {
    private static final String STARTUP_DELETED = "STARTUP_DELETED";

    private final Long startupId;

    public StartupDeletedEvent(Long startupId) {
        super(STARTUP_DELETED);
        this.startupId = startupId;
    }
}