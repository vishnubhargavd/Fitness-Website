package com.fitness.userservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

/**
 * RegisterRequest
 */
 @Data
public class RegisterRequest {
    @NotBlank(message = "Enter vaild Email")
    @Email(message = "Email cant be blank")
    private String email;

    @NotBlank (message = "Enter a vaild password")
    @Size (min = 6,message = "Enter Min 6 Chars")
    private String password;

    @NotEmpty
    private String firstName;

     @NotEmpty
    private String lastName;
}
