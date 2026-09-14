package com.fitness.userservice.service;

import com.fitness.userservice.Model.User;
import com.fitness.userservice.dto.RegisterRequest;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserService register(RegisterRequest request) {
        User user = new User();
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
    }
}
