package com.hogwarts.hogwarts_network.controller;

import com.hogwarts.hogwarts_network.dto.LoginRequest;
import com.hogwarts.hogwarts_network.dto.SignupRequest;
import com.hogwarts.hogwarts_network.entity.User;
import com.hogwarts.hogwarts_network.service.UserService;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    public User signup(@Valid @RequestBody SignupRequest request) {
        return userService.signup(request);
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        return userService.login(request.getEmail(), request.getPassword());
    }

    @GetMapping("/test")
    public String test() {
        return "Protected endpoint working";
    }
}