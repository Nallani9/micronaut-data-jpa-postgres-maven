package com.nallani.service;

import com.nallani.mapper.NallaniMapper;
import com.nallani.model.CreateInputRequest;
import com.nallani.model.NallaniEntity;
import com.nallani.model.OutputResponse;
import com.nallani.repository.NallaniRepository;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.postgresql.util.PSQLException;

import java.util.Optional;

@Singleton
public class NallaniServiceImpl implements NallaniService {

    @Inject
    NallaniRepository nallaniRepository;

    public OutputResponse find(String id) throws Exception {
        Optional<NallaniEntity> entity = nallaniRepository.findById(id);
        return NallaniMapper.INSTANCE.entityToOutput(entity.orElseThrow(() -> new RuntimeException("Id not present in Database " + id)));
    }

    @Override
    public void create(CreateInputRequest createInputRequest) throws Exception {

        try {
            //nallaniRepository.existsById(createInputRequest.id());
            nallaniRepository.save(NallaniMapper.INSTANCE.inputToEntity(createInputRequest));
        } catch (Exception e) {
            if (e.getCause() instanceof PSQLException && e.getMessage().contains("does not exist")) {
                throw new Exception("Table not present in the database");
            } else if (e.getCause() instanceof PSQLException && e.getMessage().contains("duplicate key value violates unique constraint")) {
                throw new Exception("ID " + createInputRequest.id() + " exist in Database");
            } else {
                throw e;
            }
        }
    }
}