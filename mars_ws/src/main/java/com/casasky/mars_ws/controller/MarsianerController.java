package com.casasky.mars_ws.controller;


import java.util.List;

import com.casasky.mars_ws.entity.Marsianer;
import com.casasky.mars_ws.service.MarsianerService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("marsianers")
public class MarsianerController {

    private final MarsianerService marsianerService;

    private final Logger LOG = LogManager.getLogger(getClass());


    public MarsianerController(MarsianerService marsianerService) {
        this.marsianerService = marsianerService;
    }


    @PostMapping
    public ResponseEntity<?> create(Marsianer marsianer) {

        marsianerService.persist(marsianer);
        return ResponseEntity.noContent().build();

    }


    @GetMapping
    public ResponseEntity<List<Marsianer>> marsianers() {

        return ResponseEntity.ok(marsianerService.findAll(Marsianer.class));

    }


    @GetMapping("sentry")
    public ResponseEntity<?> sentry() {

        LOG.error("Sentry event simulation", new RuntimeException("Outch! This is a bug simulation."));

        return ResponseEntity.noContent().build();

    }

}
