package com.casasky.mars_ws.controller;


import java.util.List;

import com.casasky.mars_ws.entity.Marsianer;
import com.casasky.mars_ws.service.MarsianerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("marsianers")
public class MarsianerController {

    private final MarsianerService marsianerService;


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

}
