package it.unibz.digidojo.sharedmodel.request;

import io.soabase.recordbuilder.core.RecordBuilder;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

/**
 * Request representing a user for updating.
 *
 * @param currentPassword user's current password. It's required to proceed with the update.
 * @param name user's new name
 * @param password user's new password
 * @param emailAddress user's new email address (must be unique)
 */
@RecordBuilder
public record UpdateUserRequest(
        @NotBlank String currentPassword,
        String name,
        String password,
        @Email(message = "The email must be a valid email address") String emailAddress
) {
}
