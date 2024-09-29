package com.nallani.repository;

import com.nallani.model.NallaniEntity;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;

import java.util.Optional;

@Repository
public interface NallaniRepository extends JpaRepository<NallaniEntity, String> {

    Optional<NallaniEntity> findById(String id);
}
