package com.casasky.template_ws.controller;

import com.casasky.template_ws.entity.Example;
import com.casasky.template_ws.service.ExampleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;


@RestController
@RequestMapping("examples")
public class ExampleController {

    private final ExampleService exampleService;

    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    @PostMapping
    public ResponseEntity<?> create(Example example) {

        exampleService.persist(example);
        return ResponseEntity.noContent().build();

    }

    @GetMapping
    public ResponseEntity<List<Example>> examples() {

        return ResponseEntity.ok(exampleService.findAll());

    }

}
