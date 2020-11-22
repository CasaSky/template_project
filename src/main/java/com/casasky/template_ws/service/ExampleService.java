package com.casasky.template_ws.service;

import com.casasky.template_ws.entity.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
@Transactional
public class ExampleService {

    @PersistenceContext
    private final EntityManager em;

    public ExampleService(EntityManager em) {
        this.em = em;
    }

    public void persist(Example example) {
        em.persist(example);
    }


    public List<Example> findAll() {

        return em.createQuery("select e from Example e", Example.class).getResultList();

    }

}
