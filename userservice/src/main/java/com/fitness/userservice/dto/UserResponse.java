package com.fitness.userservice.dto;

import java.time.LocalDateTime;

import lombok.Data;

/**
 * UserResponse
 */
 @Data
public class UserResponse {
    private String id;

    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;


}
