package com.nallani.model;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.serde.annotation.Serdeable;

@Introspected
@Serdeable
public record CreateInputRequest(String id, String code, String name, String city) {
}
