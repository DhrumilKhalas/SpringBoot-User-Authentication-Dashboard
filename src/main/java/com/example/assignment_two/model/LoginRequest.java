package com.example.assignment_two.model;

import java.io.Serializable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class LoginRequest implements Serializable {

    // Ensures object compatibility during serialization
    private static final long serialVersionUID = 1L;

    // Validates that the username is not blank and has a minimum length of 4
    // characters
    @NotBlank(message = "Username is required")
    @Size(min = 4, message = "Username must be at least 4 characters")
    private String loginUsername;

    // Validates that the password is not blank and has a minimum length of 8
    // characters
    @NotBlank(message = "Password is required")
    @Size(min = 8, message = "Password must be at least 8 characters")
    private String password;

    // Default constructor
    public LoginRequest() {
    }

    // Getter and setter methods for the loginUsername field
    public String getLoginUsername() {
        return loginUsername;
    }

    public void setLoginUsername(String loginUsername) {
        this.loginUsername = loginUsername;
    }

    // Getter and setter methods for the password field
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
