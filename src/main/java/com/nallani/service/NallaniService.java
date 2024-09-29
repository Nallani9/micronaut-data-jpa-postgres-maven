package com.nallani.service;

import com.nallani.model.CreateInputRequest;
import com.nallani.model.OutputResponse;

public interface NallaniService {

    OutputResponse find(String id) throws Exception;

    void create(CreateInputRequest createInputRequest) throws Exception;
}
