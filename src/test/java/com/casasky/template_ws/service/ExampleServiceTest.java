package com.casasky.template_ws.service;

import com.casasky.template_ws.entity.Example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import java.time.ZonedDateTime;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class ExampleServiceTest {

    @Autowired
    private ExampleService exampleService;

    @Autowired
    private EntityManagerFactory emf;


    @BeforeEach
    public void truncate() {

        var em = emf.createEntityManager();
        em.getTransaction().begin();
        em.createNativeQuery("truncate table example").executeUpdate();
        em.getTransaction().commit();

    }

    @Test
    public void persist() {

        var example = new Example("test");
        exampleService.persist(example);

        var examples = exampleService.findAll();
        assertThat(examples).isNotEmpty();
        assertThat(examples.get(0)).usingRecursiveComparison().isEqualTo(example);

    }

}