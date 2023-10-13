package it.unibz.digidojo.sharedmodel.event.place;

import it.unibz.digidojo.sharedmodel.event.BaseEvent;
import lombok.Getter;
import lombok.experimental.Accessors;

@Getter
@Accessors(fluent = true)
public class PlaceDeletedEvent extends BaseEvent {
    private static final String PLACE_DELETED = "PLACE_DELETED";
    private final Long placeId;

    protected PlaceDeletedEvent(final Long placeId) {
        super(PLACE_DELETED);
        this.placeId = placeId;
    }
}
