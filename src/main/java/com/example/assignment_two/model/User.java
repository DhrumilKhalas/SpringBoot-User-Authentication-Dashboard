package com.example.assignment_two.model;

import java.io.Serializable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Email;

public class User implements Serializable {

    // Ensures object compatibility during serialization
    private static final long serialVersionUID = 1L;

    // Validates that the username is not blank and has a minimum length of 4
    // characters
    @NotBlank(message = "Username is required")
    @Size(min = 4, message = "Username must be at least 4 characters")
    private String username;

    // Validates that the full name is not blank and contains only alphabetic
    // characters and spaces
    @NotBlank(message = "Full Name is required")
    @Pattern(regexp = "^[A-Za-z\\s]+$", message = "Full Name must contain only alphabetic characters and spaces")
    private String fullName;

    // Validates that the email is not blank, has a proper format, and includes an
    // "@" sign
    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    @Pattern(regexp = "^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}$", message = "Email must be alpha-numeric and include an @ sign")
    private String email;

    // Validates that the password is not blank, has a minimum length of 8
    // characters, contains at least one uppercase letter and a non-alphanumeric
    // character
    @NotBlank(message = "Password is required")
    @Size(min = 8, message = "Password must be at least 8 characters")
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*[^a-zA-Z0-9]).*$", message = "Password must be more than 8 characters and contain at least one capital letter and a non-alphanumeric character (%$#@! Etc.)")
    private String password;

    // Default constructor
    public User() {
    }

    // Getter and setter methods for the username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getter and setter methods for the fullName
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    // Getter and setter methods for the email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and setter methods for the password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
