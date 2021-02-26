package com.spring.log.controller.rest;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.Arrays;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Log4j2
@RestController
public class HelloController {

    Flux<Integer> num = Flux.fromIterable(Arrays.asList(1, 2, 3, 4, 5));

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public Flux<Integer> getNumbers() {
        return num.doOnNext(num -> log.warn("Hello from Log4j 2 - num : {}", () -> num));
    }
}