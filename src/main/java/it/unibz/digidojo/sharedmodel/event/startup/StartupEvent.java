package it.unibz.digidojo.sharedmodel.event.startup;

import it.unibz.digidojo.sharedmodel.dto.StartupDTO;
import it.unibz.digidojo.sharedmodel.event.BaseEvent;
import lombok.Getter;
import lombok.experimental.Accessors;

@Getter
@Accessors(fluent = true)
public abstract class StartupEvent extends BaseEvent {
    private final StartupDTO startup;

    protected StartupEvent(final String eventType, final StartupDTO startup) {
        super(eventType);
        this.startup = startup;
    }
}
