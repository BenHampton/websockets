package com.web.websocket.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/login")
    public ResponseEntity<String> login(@RequestParam("username") String username) {
        return ResponseEntity.ok(username);
    }
}
