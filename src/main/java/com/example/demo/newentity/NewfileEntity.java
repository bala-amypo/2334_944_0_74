package com.example.demo.newentity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

public class NewfileEntity{
    @Id
    private Long id;
    @NotBlank(message = "Should not contain space")
    private String name;
    @NotBlank(message = "Should not contain space")
    private String email;
}