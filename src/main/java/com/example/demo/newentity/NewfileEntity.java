package com.example.demo.newentity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedType;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;

public class NewfileEntity{
    @Id
    @GeneratedValue(strategy=GeneratedType.IDENTITY)
    private Long id;
    @NotBlank(message = "Should not contain space")
    private String name;
    @NotBlank(message = "Email should not contain space")
    @Email(message="Invaild format")
    private String email;
}