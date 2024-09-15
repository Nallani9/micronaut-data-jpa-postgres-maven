package com.nallani.model;

import io.micronaut.serde.annotation.Serdeable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Serdeable
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OutputResponse {
    private String id;

    private String code;

    private String name;

    private String city;
}
