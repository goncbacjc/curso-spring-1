package com.film.producer.controller;

import com.film.producer.exception.FilmProducerApiException;
import com.film.producer.request.CreateActorData;
import com.film.producer.response.ActorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arche on 1/11/2016.
 */
@RestController
@RequestMapping("/v1/actors")
public class ActorController {

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ActorResponse>> getAllActors() throws FilmProducerApiException {
        final List<ActorResponse> actors = new ArrayList<>(1);
        try {
            actors.add(new ActorResponse.Builder()
                    .withId(123)
                    .withFirstName("Testing")
                    .withLastName("Test").build());
            String error = null;
            error.toString();
        }catch(final Exception ex){
            throw new FilmProducerApiException(FilmProducerApiException.ExceptionTypeData.ACTOR_NOY_FOUND);
        }

        return new ResponseEntity<List<ActorResponse>>(actors, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ActorResponse> createActor(@RequestBody final CreateActorData createActorData){
        final ActorResponse actorResponse = new ActorResponse.Builder()
                .withId(123)
                .withFirstName(createActorData.getFirstName())
                .withLastName(createActorData.getLastName()).build();
        return new ResponseEntity<>(actorResponse, HttpStatus.OK);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ActorResponse> getActorById(@PathVariable final long id){
        return new ResponseEntity<>(new ActorResponse.Builder()
            .withId(id)
            .withFirstName("Testing")
            .withLastName("Test").build(), HttpStatus.OK);
    }
}
