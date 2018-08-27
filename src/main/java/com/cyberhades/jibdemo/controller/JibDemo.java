package com.cyberhades.jibdemo.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JibDemo {

    @GetMapping(value = "/hello/{name}")
    public ResponseEntity<String> sayHello(@PathVariable final String name) {
        return new ResponseEntity<>(String.format("Hello %s", name), HttpStatus.OK);
    }

    @GetMapping(value = "/hello")
    public ResponseEntity<String> sayHelloStranger() {
        return new ResponseEntity<>("Hello Stranger", HttpStatus.OK);
    }

}
