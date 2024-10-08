package com.nallani.model;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;

@Serdeable
@Introspected
public record OutputResponse(String id, String code, String name, String city) {
}
