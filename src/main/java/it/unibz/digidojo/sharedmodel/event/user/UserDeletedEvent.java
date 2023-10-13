package it.unibz.digidojo.sharedmodel.event.user;

import it.unibz.digidojo.sharedmodel.event.BaseEvent;
import lombok.Getter;
import lombok.experimental.Accessors;

@Getter
@Accessors(fluent = true)
public class UserDeletedEvent extends BaseEvent {
    private static final String USER_DELETED = "USER_DELETED";
    private final Long userId;

    public UserDeletedEvent(final Long userId) {
        super(USER_DELETED);
        this.userId = userId;
    }
}
