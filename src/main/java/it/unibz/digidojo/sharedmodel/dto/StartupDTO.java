package it.unibz.digidojo.sharedmodel.dto;

import java.util.Objects;

public record StartupDTO(Long id, String name, String description) {
    public StartupDTO {
        Objects.requireNonNull(id);
        Objects.requireNonNull(name);
    }
}
