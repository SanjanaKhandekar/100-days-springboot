package com.sanjana.employee_management_system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/api/employees")
    public Employee getEmployee() {
        return new Employee(1L, "Sanjana", "Java Developer");
    }
}