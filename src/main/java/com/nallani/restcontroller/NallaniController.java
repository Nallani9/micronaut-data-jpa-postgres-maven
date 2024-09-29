package com.nallani.restcontroller;


import com.nallani.model.CreateInputRequest;
import com.nallani.model.OutputResponse;
import com.nallani.service.NallaniServiceImpl;
import io.micronaut.http.annotation.*;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;
import jakarta.inject.Singleton;

@Singleton
@ExecuteOn(TaskExecutors.BLOCKING)
@Controller("/nallani")
public class NallaniController {

    private final
    NallaniServiceImpl nallaniService;

    public NallaniController(NallaniServiceImpl nallaniService) {
        this.nallaniService = nallaniService;
    }

    @Get("/{id}")
    @Produces
    @Consumes
    public OutputResponse show(String id) throws Exception {
        return nallaniService.find(id);
    }

    @Post("/create")
    @Produces
    @Consumes
    public void create(@Body CreateInputRequest createInputRequest) throws Exception {
        nallaniService.create(createInputRequest);
    }
}
