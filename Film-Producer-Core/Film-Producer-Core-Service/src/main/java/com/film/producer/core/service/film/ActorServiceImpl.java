package com.film.producer.core.service.film;

import com.film.producer.core.dao.ActorDAO;
import com.film.producer.core.model.data.ActorData;
import com.film.producer.core.model.entity.Actor;
import com.film.producer.core.service.ActorService;
import com.film.producer.core.service.tranformer.ActorDataTransformer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Silvina on 17/11/2016.
 */
@Service("actorService")
public class ActorServiceImpl implements ActorService {
    @Autowired
    private ActorDAO actorDAO;
    @Autowired
    private ActorDataTransformer actorTransformer;

    @Override
    @Transactional(propagation= Propagation.REQUIRED)
    public List<ActorData> getAll() {
        final List<Actor> actors = actorDAO.getAll();
        return actorTransformer.convertActorToActorData(actors);
    }
}
