package com.dilsonjlrjr.javatrellodashboardmateus.resource;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foo")
@Slf4j
public class FooResource {

    @GetMapping
    public ResponseEntity<String> getFoo() {
        log.info("Rota foi chamada!");
        return ResponseEntity.ok("Trello dashboard Mateus");
    }
}
