package com.ziomson.student_management_system.Dto;


import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class StudentDto {

    private Long id;
    @NotEmpty(message="Student first name should not be empty")
    private String firstname;
    @NotEmpty(message="Student last name should not be empty")
    private String lastname;
    @NotEmpty(message="Student email should not be empty")
    @Email
    private String email;
}
