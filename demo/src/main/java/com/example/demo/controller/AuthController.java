package com.example.demo.controller;

import com.example.demo.dto.LoginRequest;
import com.example.demo.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest req) {

        // BASIC but VALID authentication
        if ("admin".equals(req.getUsername())
                && "admin123".equals(req.getPassword())) {

            return jwtUtil.generateToken(req.getUsername());
        }

        throw new RuntimeException("Invalid username or password");
    }


}