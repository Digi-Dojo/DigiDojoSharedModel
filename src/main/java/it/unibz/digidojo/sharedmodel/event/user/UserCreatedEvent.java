package it.unibz.digidojo.sharedmodel.event.user;

import it.unibz.digidojo.sharedmodel.dto.UserDTO;
import lombok.Getter;
import lombok.experimental.Accessors;

@Getter
@Accessors(fluent = true)
public class UserCreatedEvent extends UserEvent {
    private static final String USER_CREATED = "USER_CREATED";

    public UserCreatedEvent(final UserDTO user) {
        super(USER_CREATED, user);
    }
}
