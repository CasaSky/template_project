package com.casasky.earth_ws.service;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.casasky.earth_ws.entity.Earthling;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class EarthlingService {

    @PersistenceContext
    private final EntityManager em;


    public EarthlingService(EntityManager em) {
        this.em = em;
    }


    public void persist(Earthling earthling) {
        em.persist(earthling);
    }


    public List<Earthling> findAll() {

        return em.createQuery("select e from Earthling e", Earthling.class).getResultList();

    }

}
