package it.unibz.digidojo.sharedmodel.event;

import lombok.Getter;

@Getter
public abstract class BaseEvent {
    private final String eventType;

    protected BaseEvent(final String eventType) {
        this.eventType = eventType;
        assert !eventType.isEmpty() : "EventType cannot be null";
    }
}