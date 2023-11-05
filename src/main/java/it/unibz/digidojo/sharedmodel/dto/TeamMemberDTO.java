package it.unibz.digidojo.sharedmodel.dto;

import java.util.Objects;

public record TeamMemberDTO(Long id, String role, UserDTO user, StartupDTO startup) {
    public TeamMemberDTO {
        Objects.requireNonNull(id);
        Objects.requireNonNull(role);
        Objects.requireNonNull(user);
        Objects.requireNonNull(startup);
    }
}
