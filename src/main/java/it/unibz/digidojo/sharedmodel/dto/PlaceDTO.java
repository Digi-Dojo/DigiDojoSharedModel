package it.unibz.digidojo.sharedmodel.dto;

import java.util.Objects;

public record PlaceDTO(Long id, String name) {
    public PlaceDTO {
        Objects.requireNonNull(id);
        Objects.requireNonNull(name);
    }
}
