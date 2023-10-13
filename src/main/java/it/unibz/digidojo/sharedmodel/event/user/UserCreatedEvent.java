package it.unibz.digidojo.sharedmodel.event.user;

import it.unibz.digidojo.sharedmodel.dto.UserDTO;
import it.unibz.digidojo.sharedmodel.event.BaseEvent;
import lombok.Getter;
import lombok.experimental.Accessors;

@Getter
@Accessors(fluent = true)
public class UserCreatedEvent extends BaseEvent {
    private static final String USER_CREATED = "USER_CREATED";
    private final UserDTO user;

    public UserCreatedEvent(final UserDTO user) {
        super(USER_CREATED);
        this.user = user;
    }
}
