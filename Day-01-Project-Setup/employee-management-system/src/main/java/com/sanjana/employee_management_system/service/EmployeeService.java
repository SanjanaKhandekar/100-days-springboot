package com.sanjana.employee_management_system.service;

import com.sanjana.employee_management_system.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    public Employee getEmployee() {
        return new Employee(1L, "Sanjana", "Java Developer");
    }

    public Employee createEmployee(Employee employee) {
        return employee;
    }
}