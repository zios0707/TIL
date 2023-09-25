package com.example.r2dbc_spring.user.controller;

import com.example.r2dbc_spring.user.controller.dto.request.UserRequest;
import com.example.r2dbc_spring.user.entity.User;
import com.example.r2dbc_spring.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class MainController {
    private final UserService service;

    @GetMapping("/")
    public Flux<User> getAll() {
        return service.getAll();
    }

    @PostMapping("/")
    public Mono<User> create(@RequestBody UserRequest request) {
        return service.create(request);
    }
}
