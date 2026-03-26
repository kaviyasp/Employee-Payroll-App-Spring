package com.bridgelabz.employeepayrollapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    // GET
    @GetMapping("/")
    public String getAll() {
        return "All Employees Data";
    }

    // GET by ID
    @GetMapping("/get/{id}")
    public String getEmployee(@PathVariable int id) {
        return "Employee ID: " + id;
    }

    // POST
    @PostMapping("/create")
    public String createEmployee(@RequestBody String employee) {
        return "Created Employee: " + employee;
    }

    // PUT
    @PutMapping("/update")
    public String updateEmployee(@RequestBody String employee) {
        return "Updated Employee: " + employee;
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        return "Deleted Employee ID: " + id;
    }
}