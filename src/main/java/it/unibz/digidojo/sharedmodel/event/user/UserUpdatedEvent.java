package it.unibz.digidojo.sharedmodel.event.user;

import it.unibz.digidojo.sharedmodel.dto.UserDTO;
import lombok.Getter;
import lombok.experimental.Accessors;

@Getter
@Accessors(fluent = true)
public class UserUpdatedEvent extends UserEvent {
    private static final String USER_UPDATED = "USER_UPDATED";

    public UserUpdatedEvent(final UserDTO user) {
        super(USER_UPDATED, user);
    }
}
