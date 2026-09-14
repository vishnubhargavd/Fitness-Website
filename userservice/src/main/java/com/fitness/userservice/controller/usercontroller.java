package com.fitness.userservice.controller;

import com.fitness.userservice.dto.RegisterRequest;
import com.fitness.userservice.dto.UserResponse;
import com.fitness.userservice.service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class usercontroller {

    private UserService userService;

    @GetMapping("/register")
    public ResponseEntity<UserResponse> resgister(
        @Valid @RequestBody RegisterRequest request
    ) {
        return ResponseEntity.ok(UserService.register(request));
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserResponse> getUserProfile(
        @PathVariable String userId
    ) {
        return ResponseEntity.ok(UserService.getUserProfile(userId));
    }
}
