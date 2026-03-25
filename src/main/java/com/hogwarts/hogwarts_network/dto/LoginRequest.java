package com.hogwarts.hogwarts_network.dto;

import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String password;
}