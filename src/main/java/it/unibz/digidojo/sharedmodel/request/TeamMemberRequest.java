package it.unibz.digidojo.sharedmodel.request;

import io.soabase.recordbuilder.core.RecordBuilder;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/**
 * Request representing a team member to create, read, and update.
 *
 * @param userId user id
 * @param startupId startup id
 * @param role role that the user is going to perform in the startup
 */
@RecordBuilder
public record TeamMemberRequest(
        @NotNull Long userId,
        @NotNull Long startupId,
        @NotBlank String role) {
}
