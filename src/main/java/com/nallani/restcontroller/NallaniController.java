package com.nallani.restcontroller;


import com.nallani.model.OutputResponse;
import com.nallani.service.NallaniServiceImpl;
import io.micronaut.http.annotation.Consumes;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
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
    public OutputResponse show(String id) {
        return nallaniService.find(id);
    }

    @Get
    public String hello() {
        return "Hello!";
    }
}
