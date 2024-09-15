package com.nallani.model;

import io.micronaut.serde.annotation.Serdeable;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@ToString
@Serdeable
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "nallani")
public class NallaniEntity {

    @Id
    @GenericGenerator(name="gen",strategy="increment")
    @GeneratedValue(generator="gen")
    @Column(name = "id", unique = true, nullable = false)
    private String id;

    private String code;

    private String name;

    private String city;

}
