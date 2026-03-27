package com.bridgelabz.employeepayrollapp.dto;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EmployeeDTO {

    @NotBlank(message = "Name should not be empty")
    private String name;

    @Min(value = 500, message = "Salary must be greater than 500")
    private double salary;
}