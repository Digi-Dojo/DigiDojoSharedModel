package it.unibz.digidojo.sharedmodel.event.user;

import it.unibz.digidojo.sharedmodel.dto.UserDTO;
import it.unibz.digidojo.sharedmodel.event.BaseEvent;
import lombok.Getter;
import lombok.experimental.Accessors;

@Getter
@Accessors(fluent = true)
public abstract class UserEvent extends BaseEvent {
    private final UserDTO user;

    protected UserEvent(final String eventType, final UserDTO user) {
        super(eventType);
        this.user = user;
    }
}
