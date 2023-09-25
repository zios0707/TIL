package com.example.r2dbc_spring.user.repository;

import com.example.r2dbc_spring.user.entity.User;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends R2dbcRepository<User, String> {
}
