package it.unibz.digidojo.sharedmodel.event.user;

import it.unibz.digidojo.sharedmodel.event.BaseEvent;
import lombok.Getter;
import lombok.experimental.Accessors;

// TODO: Define how the services are going to validate the user request based on this event
@Getter
@Accessors(fluent = true)
public class UserLoggedInEvent extends BaseEvent {
    private static final String LOGGED_IN = "LOGGED_IN";

    private final Long userId;

    public UserLoggedInEvent(final Long userId) {
        super(LOGGED_IN);
        this.userId = userId;
    }
}
