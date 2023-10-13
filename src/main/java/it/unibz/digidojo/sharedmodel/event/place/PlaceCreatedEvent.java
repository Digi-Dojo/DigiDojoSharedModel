package it.unibz.digidojo.sharedmodel.event.place;

import it.unibz.digidojo.sharedmodel.dto.PlaceDTO;
import it.unibz.digidojo.sharedmodel.event.BaseEvent;
import lombok.Getter;
import lombok.experimental.Accessors;

@Getter
@Accessors(fluent = true)
public class PlaceCreatedEvent extends BaseEvent {
    private static final String USER_CREATED = "USER_CREATED";
    private final PlaceDTO place;

    public PlaceCreatedEvent(final PlaceDTO place) {
        super(USER_CREATED);
        this.place = place;
    }
}
