package com.example.r2dbc_spring.user.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private String username;
    private String password;
}
