package com.example.r2dbc_spring.user.service;

import com.example.r2dbc_spring.user.controller.dto.request.UserRequest;
import com.example.r2dbc_spring.user.entity.User;
import com.example.r2dbc_spring.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;

    public Mono<User> create(UserRequest request) {
        return repository.save(User.builder()
                        .password(request.getPassword())
                        .username(request.getUsername())
                        .build());
    }

    public Flux<User> getAll() {
        return repository.findAll();
    }
}
