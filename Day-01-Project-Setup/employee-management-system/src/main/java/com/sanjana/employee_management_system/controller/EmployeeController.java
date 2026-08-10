package com.sanjana.employee_management_system.controller;

import com.sanjana.employee_management_system.model.Employee;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @GetMapping
    public Employee getEmployee() {
        return new Employee(1L, "Sanjana", "Java Developer");
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employee;
    }
}