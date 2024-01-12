package com.fitness.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fitness.userservice.service.*;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

import private String email;
private String password; private String firstName; private String lastName;;
import com.fitness.userservice.dto.UserResponse;

@RestController
@RequestMapping ("/api/users")
@AllArgsConstructor
public class usercontroller {

    private UserService userService;

	@GetMapping ("/{userId}")
	public ResponseEntity<UserResponse>resgister(@RequestBody RegisterRequest request){
	return ResponseEntity.ResponseEntity.ok(request.register(request));

	}
	@GetMapping ("/register")
	public ResponseEntity<UserResponse>getUserProfile( @Valid @PathVariable String userId){
	return ResponseEntity.ok(UserService.getUserProfile(userId));

	}
}
