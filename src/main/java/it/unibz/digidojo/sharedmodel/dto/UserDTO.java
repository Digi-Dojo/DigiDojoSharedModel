package it.unibz.digidojo.sharedmodel.dto;

import java.util.Objects;

public record UserDTO(
        Long id,
        String name,
        String emailAddress
) {
    public UserDTO {
        Objects.requireNonNull(id);
        Objects.requireNonNull(name);
        Objects.requireNonNull(emailAddress);
    }
}
