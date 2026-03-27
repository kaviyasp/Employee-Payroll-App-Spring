package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
import com.bridgelabz.employeepayrollapp.model.Employee;
import com.bridgelabz.employeepayrollapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public Employee getEmployeeById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Employee createEmployee(EmployeeDTO dto) {
        Employee emp = new Employee(dto.getName(), dto.getSalary());
        return repository.save(emp);
    }

    public Employee updateEmployee(int id, EmployeeDTO dto) {
        Employee emp = repository.findById(id).orElse(null);
        if (emp != null) {
            emp = new Employee(dto.getName(), dto.getSalary());
            return repository.save(emp);
        }
        return null;
    }

    public void deleteEmployee(int id) {
        repository.deleteById(id);
    }
}