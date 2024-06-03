package com.example.JWT_RestAPI2.service;

import org.springframework.stereotype.Service;
import com.example.JWT_RestAPI2.security.JwtUtil;

@Service
public class AuthService {
    public String generateToken(String username) {
        String token = JwtUtil.generateToken(username);
        return token;
    }

    public String extractUsername(String token) {
        String username = JwtUtil.extractUsername(token);
        return username;
    }
}
