package it.unibz.digidojo.sharedmodel.request;

import io.soabase.recordbuilder.core.RecordBuilder;
import jakarta.validation.constraints.NotEmpty;

/**
 * Request representing a startup to create, read, and update.
 *
 * @param name name of the startup (must be unique)
 * @param description description of the startup
 */
@RecordBuilder
public record StartupRequest(
        @NotEmpty String name,
        String description
) {
}
