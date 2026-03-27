package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
import com.bridgelabz.employeepayrollapp.model.Employee;
import com.bridgelabz.employeepayrollapp.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @Autowired
    private EmployeeService service;

    // GET ALL
    @GetMapping("/")
    public List<Employee> getAll() {
        log.info("Fetching all employees");
        return service.getAllEmployees();
    }

    // GET BY ID
    @GetMapping("/get/{id}")
    public Employee getEmployee(@PathVariable int id) {
        log.info("Fetching employee with ID: {}", id);
        return service.getEmployeeById(id);
    }

    // CREATE
    @PostMapping("/create")
    public Employee createEmployee(@Valid @RequestBody EmployeeDTO dto) {
        log.info("Creating employee: {}", dto.getName());
        return service.createEmployee(dto);
    }

    // UPDATE
    @PutMapping("/update/{id}")
    public Employee updateEmployee(@PathVariable int id, @Valid @RequestBody EmployeeDTO dto) {
        log.info("Updating employee with ID: {}", id);
        return service.updateEmployee(id, dto);
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        log.warn("Deleting employee with ID: {}", id);
        service.deleteEmployee(id);
        return "Deleted Successfully";
    }
}