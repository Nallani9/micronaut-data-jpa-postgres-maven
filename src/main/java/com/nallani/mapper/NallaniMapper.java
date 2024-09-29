package com.nallani.mapper;

import com.nallani.model.CreateInputRequest;
import com.nallani.model.NallaniEntity;
import com.nallani.model.OutputResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface NallaniMapper {
    NallaniMapper INSTANCE = Mappers.getMapper(NallaniMapper.class);

    NallaniEntity inputToEntity(CreateInputRequest inputRequest);

    CreateInputRequest entityToInput(NallaniEntity nallaniEntity);

    NallaniEntity outputToEntity(OutputResponse outputResponse);

    OutputResponse entityToOutput(NallaniEntity nallaniEntity);

}
