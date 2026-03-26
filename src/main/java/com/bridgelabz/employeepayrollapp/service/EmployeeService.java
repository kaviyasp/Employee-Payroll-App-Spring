package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
import com.bridgelabz.employeepayrollapp.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private List<Employee> employeeList = new ArrayList<>();
    private int idCounter = 1;

    // GET all
    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    // GET by ID
    public Employee getEmployeeById(int id) {
        return employeeList.stream()
                .filter(emp -> emp.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // CREATE
    public Employee createEmployee(EmployeeDTO dto) {
        Employee emp = new Employee(idCounter++, dto.name, dto.salary);
        employeeList.add(emp);
        return emp;
    }

    // UPDATE
    public Employee updateEmployee(int id, EmployeeDTO dto) {
        Employee emp = getEmployeeById(id);
        if (emp != null) {
            employeeList.remove(emp);
            Employee updated = new Employee(id, dto.name, dto.salary);
            employeeList.add(updated);
            return updated;
        }
        return null;
    }

    // DELETE
    public void deleteEmployee(int id) {
        employeeList.removeIf(emp -> emp.getId() == id);
    }
}