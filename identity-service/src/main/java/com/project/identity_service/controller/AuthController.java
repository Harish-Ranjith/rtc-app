package com.project.identity_service.controller;

import com.project.identity_service.model.User;
import com.project.identity_service.service.AuthService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return authService.saveUser(user);
    }
}