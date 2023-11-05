package it.unibz.digidojo.sharedmodel.request;

import io.soabase.recordbuilder.core.RecordBuilder;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/**
 * Request representing a user for creation and login.
 *
 * @param name user's name
 * @param password user's password
 * @param emailAddress user's email address (must be unique)
 */
@RecordBuilder
public record UserRequest(
        @NotBlank String name,
        @NotBlank String password,
        @NotNull @Email(message = "The email must be a valid email address") String emailAddress
) {
}
