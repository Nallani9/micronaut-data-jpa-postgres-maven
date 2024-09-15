package com.nallani.service;

import com.nallani.model.NallaniEntity;
import com.nallani.model.OutputResponse;
import com.nallani.repository.NallaniRepository;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.Optional;

@Singleton
public class NallaniServiceImpl {

    @Inject
    NallaniRepository nallaniRepository;

    public OutputResponse find(String id) {
        System.out.printf("id", id);
       Optional<NallaniEntity> entity = nallaniRepository.findById(id);

        System.out.printf(entity.get().toString());

        OutputResponse response = new OutputResponse();
        response.setId(entity.get().getId());
        response.setCity(entity.get().getCity());
        response.setCode(entity.get().getCode());
        response.setName(entity.get().getName());
        return response;
    }
}