package com.film.producer.core.dao.impl;

import com.film.producer.core.dao.ActorDAO;
import com.film.producer.core.model.entity.Actor;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Silvina on 15/11/2016.
 */
@Repository("actorDAO")
public class ActorDAOImp implements ActorDAO{

    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<Actor> getAll() {
        final Criteria criteria= sessionFactory.getCurrentSession().createCriteria(Actor.class);
        return criteria.list();
    }
}
