package com.nallani.model;

import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@ToString
@Serdeable
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "nallani", schema = "public")
public class NallaniEntity {

    @Id
    @Column(name = "id", unique = true, nullable = false)
    private String id;

    private String code;

    private String name;

    private String city;

}
